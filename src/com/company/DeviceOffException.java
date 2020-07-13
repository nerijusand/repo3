package com.company;

public class DeviceOffException extends Exception {
    String message;
    public DeviceOffException (String msg){
        super(msg);
        message = msg;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
