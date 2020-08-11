package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Biudzetas {
    ArrayList <Irasas> irasai = new ArrayList<>();



    public void pridetiIrasa (Irasas irasas){

        irasai.add(irasas);
    }

    public ArrayList<PajamuIrasas> gautiPajamuIrasus(){
        ArrayList<PajamuIrasas> pajamuIrasai = new ArrayList<>();
        for (Irasas irasas: irasai){
            if (irasas instanceof PajamuIrasas){
                pajamuIrasai.add((PajamuIrasas)irasas);
            }
        }
            return pajamuIrasai;
    }
    public ArrayList<IslaiduIrasas> gautiIslaiduIrasus(){
        ArrayList<IslaiduIrasas> islaiduIrasai = new ArrayList<>();
        for (Irasas irasas: irasai){
            if (irasas instanceof IslaiduIrasas){
                islaiduIrasai.add((IslaiduIrasas) irasas);
            }
        }
        return islaiduIrasai;
    }
    public void atnaujintiIrasas(Irasas irasas){

        int count = 0;

        while (irasai.size()>count){

            if (irasai.get(count).equals(irasas)){
                irasai.remove(irasai.get(count));
                irasai.add(irasas);
            }
            count++;
        }

    }
}
