package com.bootcamp.w6.miniProj.RestAPIminiProj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends Exception{

    public RecordNotFoundException(String message){
        super(message);
    }
    public RecordNotFoundException(){
        super("Record Not Found");
    }
}
