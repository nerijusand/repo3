package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class PajamuIrasas extends Irasas{
  private String pajamuKategorija;
   private String pajamuTipas;

    public PajamuIrasas(double suma, LocalDate data, String komenmtaras, String pajamuKategorija, String pajamuTipas) {
        super( suma, data, komenmtaras);
        this.pajamuKategorija = pajamuKategorija;
        this.pajamuTipas = pajamuTipas;
    }

    public String getPajamuKategorija() {
        return pajamuKategorija;
    }

    public String getPajamuTipas() {
        return pajamuTipas;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" +" "+
                super.toString()+" "+
                "pajamuKategorija='" + pajamuKategorija + '\'' +
                ", pajamuTipas='" + pajamuTipas + '\'' +
                '}'+"\n";
    }
}
