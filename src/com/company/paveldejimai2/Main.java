package com.company.paveldejimai2;


public class Main {
    public static void main(String[] args) {
        DuomenuBaze duomenuBaze = new DuomenuBaze();
        Info info1 = new Info(1, "zodis");
        Info info2 = new Info(2, "zodis2");
        Info info3 = new Info(3, "zodis3");
        duomenuBaze.saugotiInfo(info1);
        duomenuBaze.saugotiInfo(info2);
        duomenuBaze.saugotiInfo(info3);

        duomenuBaze.rastiInfo(3);

        duomenuBaze.rastiInfo("zodis2");
    }

}
