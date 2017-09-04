package com.taobao.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileItem {
    private Contract contract;

    public FileItem(File file) {
        this.contract = new LocalContract(file);
    }

    public FileItem(String filePath) {
        this(new File(filePath));
    }

    public FileItem(String fileName, byte[] content) {
        this(fileName, content, null);
    }

    public FileItem(String fileName, byte[] content, String mimeType) {
        this.contract = new ByteArrayContract(fileName, content, mimeType);
    }

    public FileItem(String fileName, InputStream stream) {
        this(fileName, stream, null);
    }

    public FileItem(String fileName, InputStream stream, String mimeType) {
        this.contract = new StreamContract(fileName, stream, mimeType);
    }

    public boolean isValid() {
        return this.contract.isValid();
    }

    public String getFileName() {
        return this.contract.getFileName();
    }

    public String getMimeType() throws IOException {
        return this.contract.getMimeType();
    }

    public long getFileLength() {
        return this.contract.getFileLength();
    }

    public void write(OutputStream output) throws IOException {
        this.contract.write(output);
    }

    private static abstract interface Contract {
        public abstract boolean isValid();

        public abstract String getFileName();

        public abstract String getMimeType();

        public abstract long getFileLength();

        public abstract void write(OutputStream paramOutputStream) throws IOException;
    }

    private static class LocalContract implements Contract {
        private File file;

        public LocalContract(File file) {
            this.file = file;
        }

        public boolean isValid() {
            return (this.file != null) && (this.file.exists()) && (this.file.isFile());
        }

        public String getFileName() {
            return this.file.getName();
        }

        public String getMimeType() {
            return "application/octet-stream";
        }

        public long getFileLength() {
            return this.file.length();
        }

        public void write(OutputStream output) throws IOException {
            InputStream input = null;
            try {
                input = new FileInputStream(this.file);
                byte[] buffer = new byte[4096];
                int n = 0;
                while (-1 != (n = input.read(buffer))) {
                    output.write(buffer, 0, n);
                }
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        }
    }

    private static class ByteArrayContract implements Contract {
        private String fileName;
        private byte[] content;
        private String mimeType;

        public ByteArrayContract(String fileName, byte[] content, String mimeType) {
            this.fileName = fileName;
            this.content = content;
            this.mimeType = mimeType;
        }

        public boolean isValid() {
            return (this.content != null) && (this.fileName != null);
        }

        public String getFileName() {
            return this.fileName;
        }

        public String getMimeType() {
            if (this.mimeType == null) {
                return "application/octet-stream";
            }
            return this.mimeType;
        }

        public long getFileLength() {
            return this.content.length;
        }

        public void write(OutputStream output) throws IOException {
            output.write(this.content);
        }
    }

    private static class StreamContract implements Contract {
        private String fileName;
        private InputStream stream;
        private String mimeType;

        public StreamContract(String fileName, InputStream stream, String mimeType) {
            this.fileName = fileName;
            this.stream = stream;
            this.mimeType = mimeType;
        }

        public boolean isValid() {
            return (this.stream != null) && (this.fileName != null);
        }

        public String getFileName() {
            return this.fileName;
        }

        public String getMimeType() {
            if (this.mimeType == null) {
                return "application/octet-stream";
            }
            return this.mimeType;
        }

        public long getFileLength() {
            return 0L;
        }

        public void write(OutputStream output) throws IOException {
            try {
                byte[] buffer = new byte[4096];
                int n = 0;
                while (-1 != (n = this.stream.read(buffer))) {
                    output.write(buffer, 0, n);
                }
            } finally {
                if (this.stream != null) {
                    this.stream.close();
                }
            }
        }
    }
}


