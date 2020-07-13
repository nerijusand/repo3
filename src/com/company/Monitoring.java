package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monitoring {


    public void pingAllDevices(List<Device> devices) throws DeviceOffException {
        for (Device device: devices){

                device.ping();



        }


    }


}
