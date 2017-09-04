package com.taobao.api.internal.util.json;

public class BufferErrorListener implements JSONErrorListener {
    protected StringBuffer buffer;
    private String input;

    public BufferErrorListener(StringBuffer buffer) {
        this.buffer = buffer;
    }

    public BufferErrorListener() {
        this(new StringBuffer());
    }

    public void start(String input) {
        this.input = input;
        this.buffer.setLength(0);
    }

    public void error(String type, int col) {
        this.buffer.append("expected ");
        this.buffer.append(type);
        this.buffer.append(" at column ");
        this.buffer.append(col);
        this.buffer.append("\n");
        this.buffer.append(this.input);
        this.buffer.append("\n");
        indent(col - 1, this.buffer);
        this.buffer.append("^");
    }

    private void indent(int n, StringBuffer ret) {
        for (int i = 0; i < n; i++) {
            ret.append(' ');
        }
    }

    public void end() {
    }
}


