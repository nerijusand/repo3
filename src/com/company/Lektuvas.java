package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle(){
       try {
           vaziuokle();

           System.out.println("OK vaziukle sekmingai isskleista");
       }catch (LaikinaKlaida e){
           System.out.println("ERROR: važiuoklės išskleisti nepavyko. Priezastis "+ e.getPriezastis());
       }catch (SvarbiKlaida e){
           System.out.println("ERROR: važiuoklės išskleisti nepavyko. Priezastis "+ e.getPriezastis());
       } catch (VaziuoklesIsskleidimoKlaida e){
           System.out.println("ERROR: važiuoklės išskleisti nepavyko. Priezastis "+ e.getPriezastis() + "Svarbumas: nezinomas");
       }

    }
    public void vaziuokle()throws VaziuoklesIsskleidimoKlaida{
        Random rand = new Random();
        int i = rand.nextInt(10);
        switch (i){
            case 0: throw new LaikinaKlaida("neatsidare durys ");
            case 1: throw new SvarbiKlaida("nenusileido ratas ");
            case 2: throw new VaziuoklesIsskleidimoKlaida("pakilo ratas ");

        }

    }
}
