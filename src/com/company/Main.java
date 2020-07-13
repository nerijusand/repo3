package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Monitoring monitoring = new Monitoring();

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(new Printer(true,123454));
        deviceList.add(new Mouse(true,123455));
        deviceList.add(new Display(false,121454));
        monitoring.pingAllDevices(deviceList);
    }

}
