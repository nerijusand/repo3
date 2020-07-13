package com.company;

public class Display extends Device{
    public Display(boolean ison, int id) {
        super(ison, id);
    }

    @Override
    public void ping() throws DeviceOffException {
        super.ping();
    }
}
