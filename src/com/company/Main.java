package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//        uzduotis1();
        saveDrivers(Paths.get("src", "com", "company", "drivers_out"), Driver.drivers());
    }

    public static void saveDrivers(Path path, List<Driver> drivers) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Driver driver : drivers) {
                writer.write(driver.toLine());
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void uzduotis1() {
        try (  BufferedReader reader = Files.newBufferedReader(Paths.get("src", "com", "company", "vardas"));
               BufferedWriter writer = Files.newBufferedWriter(Paths.get("src", "com", "company", "vardas_out"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                writer.write(String.format("%s %s", new StringBuffer(parts[0]).reverse(), new StringBuffer(parts[1]).reverse()));
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void uzduotis2() {

    }
}

