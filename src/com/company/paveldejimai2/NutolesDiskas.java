package com.company.paveldejimai2;

import java.util.ArrayList;

public class NutolesDiskas implements Saugykla {
    ArrayList<Info> infoArrayList = new ArrayList<>();

    @Override
    public void saugotiInfo(Info info) {
        infoArrayList.add(info);

    }

    @Override
    public Info rastiInfo(Integer id) {
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        return null;
    }
}
