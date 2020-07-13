package com.company;

public class Mouse extends Device {
    public Mouse(boolean ison, int id) {
        super(ison, id);
    }

    @Override
    public void ping() throws DeviceOffException {
        super.ping();
    }
}
