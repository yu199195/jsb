package com.jsb.rest.comm;

public class JSBRestException
        extends Exception {
    private static final long serialVersionUID = 1L;

    public JSBRestException() {
    }

    public JSBRestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public JSBRestException(String message, Throwable cause) {
        super(message, cause);
    }

    public JSBRestException(String message) {
        super(message);
    }

    public JSBRestException(Throwable cause) {
        super(cause);
    }
}


