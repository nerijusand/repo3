package com.company.paveldejimai2;

import java.util.HashMap;
import java.util.Map;

public class DuomenuBaze implements Saugykla {
    HashMap<Integer,Info> infoHashMap = new HashMap();

   @Override
    public void saugotiInfo(Info info){
        infoHashMap.put(info.getId(),info);
       System.out.println("Isaugota i domenu baze");
    }

    @Override
    public Info rastiInfo(Integer id) {
       for (Map.Entry me : infoHashMap.entrySet()){
            if (id.equals(me.getKey())){
                System.out.println("Rasta duomenu bazeje pagal id " + infoHashMap.get(me.getKey()));
            return  infoHashMap.get(me.getKey());

           }

       }
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Map.Entry me : infoHashMap.entrySet()){
             Info info = (Info) me.getValue();

            if (info.getTekstas().equals(zodis)){
                System.out.println("Rasta duomenu bazeje pagal zodi " + infoHashMap.get(info));
                return infoHashMap.get(info);
            }
            System.out.println("zodis nerastas");
        }
       return null;
    }
}
