package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;

public class PlantErrorMessage {
    private String message;
    private HttpStatus httpStatus;

    public PlantErrorMessage(String message,HttpStatus httpStatus){
        this.message=message;
        this.httpStatus=httpStatus;
    }
}
