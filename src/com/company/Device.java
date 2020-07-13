package com.company;

public class Device {
    private boolean ison;
    private int id;

    public Device(boolean ison, int id) {
        this.ison = ison;
        this.id = id;
    }



    public void ping() throws DeviceOffException{
       if (ison){
           System.out.println("Irenginius ijungtas");
       }else {
           throw new DeviceOffException("Irenginis isjungtas");
       }


    }

}
