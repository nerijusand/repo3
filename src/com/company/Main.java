package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Main {
    static Biudzetas biudzetas = new Biudzetas();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        String ivestis = "";
        while (!ivestis.equals("6")){
            meniu();
            ivestis = scanner();
            switch (ivestis){
                case "1":
                    biudzetas.pridetiIrasa(pajamuIrasoSuvedimas());
                    break;
                case "2":
                    biudzetas.pridetiIrasa(islaiduIrasoSuvedimas());
                    break;
                case "3":
                    System.out.println(biudzetas.gautiIslaiduIrasus());
                    System.out.println(biudzetas.gautiPajamuIrasus());
                    Irasas surastasIrasas = surastiIrasa();
                    Irasas redaguotasIrasas = redaguotiIrasas(surastasIrasas);
                    biudzetas.atnaujintiIrasas(redaguotasIrasas);


                    break;
                case "4":
                    System.out.println("Saskaitos balansas: ");
                    System.out.println(balansas());

                    break;
                case "5":
                    System.out.println(biudzetas.gautiIslaiduIrasus());
                    System.out.println(biudzetas.gautiPajamuIrasus());
                    break;
                case "6":
                    break;

                default:
                    nezinomaIvestis();
            }

        }

    }

    public static void meniu(){
        System.out.println("[1] - Sukurti pajamu irasa \n" +
                "[2] - Sukurti islaidu irasa\n" +
                "[3] - Redaguoti irasa\n" +
                "[4] - Perziureti balansas\n" +
                "[5] - Atspausdinti sarasa\n" +
                "[6] - Baigti");
    }

    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static double scannerDouble(){

        return Double.parseDouble(scanner.next());
    }

    public static void nezinomaIvestis(){
        System.out.println("Nezinoma ivestis");
    }
    public static PajamuIrasas pajamuIrasoSuvedimas(){
        System.out.println("Iveskite suma");
        double suma = scannerDouble();
        LocalDate data = LocalDate.now();
        System.out.println("Iveskite komentara");
        String komentaras = scanner();
        System.out.println("Iveskite pajamui Kategorija");
        String kategorija = scanner();
        System.out.println("Iveskite pajamui tipa");
        String pajamuTipas = scanner();

        return new PajamuIrasas(suma,data,komentaras,kategorija,pajamuTipas);

    }
    public static IslaiduIrasas islaiduIrasoSuvedimas(){
        System.out.println("Iveskite suma");
        double suma = scannerDouble();
        LocalDate data = LocalDate.now();
        System.out.println("Iveskite komentara");
        String komentaras = scanner();
        System.out.println("Iveskite islaidu Kategorija");
        String kategorija = scanner();
        System.out.println("Iveskite islaidu tipa");
        String islaiduTipas = scanner();

        return new IslaiduIrasas(suma,data,komentaras,kategorija,islaiduTipas);

    }
    public static double balansas (){

        double suma = 0;
        for (Irasas irasas:biudzetas.irasai){
            if (irasas instanceof PajamuIrasas) {
                    suma = suma + irasas.getSuma();
            }else if(irasas instanceof IslaiduIrasas){
                suma = suma - irasas.getSuma();
            }
        }
        return suma;
    }
    public static Irasas surastiIrasa() {
         boolean salig = true;
        while (salig) {
            System.out.println("Pasirinkite redaguojama irasa pagal id: ");
            int id = scanner.nextInt();
            for (Irasas irasas : biudzetas.irasai) {
                if (irasas.getId() == id) {
                    salig = false;
                    return irasas;
                }
            }
        }return null;
    }
    public static Irasas redaguotiIrasas (Irasas irasas) {
        boolean salig = true;

        while (salig) {
            System.out.println("Suma: " + irasas.getSuma());
            System.out.println("[1] - redaguoti, [2] - toliau");
            switch (scanner.next()) {
                case "1":
                    System.out.println("iveskite nauja suma");
                    irasas.setSuma(scanner.nextDouble());
                    break;
                case "2":
                    salig = false;
                    break;
                default:
                    System.out.println("bloga ivestis");

            }
        }
        while (!salig) {
            System.out.println("Komentaras: " + irasas.getKomenmtaras());
            System.out.println("[1] - redaguoti, [2] - toliau");
            switch (scanner.next()) {
                case "1":
                    System.out.println("iveskite nauja komentara:");
                    irasas.setKomenmtaras(scanner.next());
                    break;
                case "2":
                    salig = true;
                    break;
                default:
                    System.out.println("bloga ivestis");

            }
        }

        return irasas;

    }


}