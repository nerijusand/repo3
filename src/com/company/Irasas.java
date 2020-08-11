package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Irasas {
    private static int stid = 1;
    private int id;
    private double suma;
    private LocalDate data;
    private String komenmtaras;

    public Irasas(double suma, LocalDate data, String komenmtaras) {
        this.id = stid++;
        this.suma = suma;
        this.data = data;
        this.komenmtaras = komenmtaras;
    }

    public int getId() {
        return id;
    }

    public double getSuma() {
        return suma;
    }

    public LocalDate getData() {
        return data;
    }

    public String getKomenmtaras() {
        return komenmtaras;
    }

    @Override
    public String toString() {
        return "Irasas{" +
                "id=" + id +
                ", suma=" + suma +
                ", data=" + data +
                ", komenmtaras='" + komenmtaras + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Irasas irasas = (Irasas) o;
        return id == irasas.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setKomenmtaras(String komenmtaras) {
        this.komenmtaras = komenmtaras;
    }
}
