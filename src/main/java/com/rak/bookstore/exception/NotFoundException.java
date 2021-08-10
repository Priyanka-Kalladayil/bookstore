package com.rak.bookstore.exception;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-05T17:34:30.092+04:00")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
