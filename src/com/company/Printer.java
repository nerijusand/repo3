package com.company;

public class Printer extends Device{
    public Printer(boolean ison, int id) {
        super(ison, id);
    }

    @Override
    public void ping() throws DeviceOffException {
        super.ping();
    }
}
