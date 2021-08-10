package com.rak.bookstore.exception;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-05T17:34:30.092+04:00")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
