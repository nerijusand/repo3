package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {

    private String islaiduKategorija;
    private String islaiduTipas;

    public IslaiduIrasas( double suma, LocalDate data, String komenmtaras, String islaiduKategorija, String islaiduTipas) {
        super(suma, data, komenmtaras);
        this.islaiduKategorija = islaiduKategorija;
        this.islaiduTipas = islaiduTipas;
    }

    public String getIslaiduKategorija() {
        return islaiduKategorija;
    }

    public String getIslaiduTipas() {
        return islaiduTipas;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" +" "+
                super.toString()+" "+
                "islaiduKategorija='" + islaiduKategorija + '\'' +
                ", islaiduTipas='" + islaiduTipas + '\'' +
                '}'+"\n" ;
    }
}
