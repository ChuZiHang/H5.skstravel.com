package com.skstravel.web.exception;

/**
 * Created by Q_先森 on 2017/12/18.
 */
public class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);

    }
}
