package com.company;

import java.util.ArrayList;

public class Miskas<Iv> {
    private Iv iv;

    ArrayList medziai = new ArrayList();
    private ArrayList spygliuociai = new ArrayList();
    private ArrayList berzai = new ArrayList();

    public ArrayList<Iv> itrauktiMiska(Iv iv) {
        medziai.add(iv);
        return medziai;
    }

    public Iv ivarusMiskas() {
        return (Iv) ("Ivairus miskas: " + medziai);
    }

    public Iv spygliuociumiskas() {
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();

        for (Object medis : medziai) {
            if (medis.equals(egle.turi()) || medis.equals(pusis.turi()) || medis.equals(kadagys.turi())) {
                spygliuociai.add(medis);
            }
        }
        return (Iv) ("Spygliuociu miskas: " + spygliuociai);
    }

    public Iv berzuMiskas() {
        Berzas berzas = new Berzas();
        for (Object medis : medziai) {
            if (medis.equals(berzas.turi())) {
                berzai.add(medis);
            }
        }
        return (Iv) ("Berzu miskas: " + berzai);
    }

}
