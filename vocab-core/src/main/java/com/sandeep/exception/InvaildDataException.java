package com.sandeep.exception;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvaildDataException extends RuntimeException{

    private String code;
    /**
     * @param message
     * @param code
     */
    public InvaildDataException(String message , String code) {
        super(message);
        this.code = code;
    }
}
