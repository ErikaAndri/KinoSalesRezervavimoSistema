package com.erika.prj.ksr.KTFunkcijos;

import com.erika.prj.ksr.Elementai.Filmas;
import com.erika.prj.ksr.Elementai.Seansas;
import com.erika.prj.ksr.KTFunkcijos.Rezervacija;

import java.util.*;

public class KinoTeatras {

    private List<Seansas> repertuaras = new ArrayList<>();

    public List<Seansas> getRepertuaras() {
        return repertuaras;
    }

    public List<Seansas> rodytiSeansus(boolean rodytiVisus) {
        List<Seansas> result = new ArrayList<>();

        if (rodytiVisus) {
            return repertuaras;                                         // grazina pilna repertuaro sarasa
        }

        for (Seansas s : repertuaras) {
            if (!s.isJauIvyko()) {
                result.add(s);                                         //cia ideda i sarasa filma, jeigu jis dar neivyko
            }
        }
        return result;
    }

    public boolean rezervuoti(String id, boolean apmoketa) {

        Seansas seansas = arTinkamasSeansas(id);
        if (seansas != null) {
            return rezervuoti(seansas, apmoketa) != null;
        }
        return false;
    }

    private Rezervacija rezervuoti(Seansas seansas, boolean apmoketa) {

        for (int i = 0; i < seansas.getSedimosVietos().length; i++) {
            if (seansas.getSedimosVietos()[i] == null) {
                seansas.getSedimosVietos()[i] = new Rezervacija(seansas, apmoketa);
                return seansas.getSedimosVietos()[i];
            }
        }
        return null;
    }

    private Seansas arTinkamasSeansas(String id) {
        for (Seansas s : repertuaras) {
            if (s.getId().equalsIgnoreCase(id)) {
                if (!s.isJauIvyko()) {
                    return s;
                }
                break;
            }
        }
        return null;
    }

    public List<Filmas> filmuTOP(int topDydis) {
        Map<Filmas, Integer> rezPagalFilma = new HashMap<>();
        for (Seansas s : repertuaras) {
            if (s.isJauIvyko()) {
                Integer filmoRezervacijos = 0;
                if (rezPagalFilma.containsKey(s.getFilmas())) {
                    filmoRezervacijos = rezPagalFilma.get(s.getFilmas());
                }
                filmoRezervacijos += rezervuotosVietos(s);
                rezPagalFilma.put(s.getFilmas(), filmoRezervacijos);
            }
        }
        return null;
    }

    public int rezervuotosVietos(Seansas s) {          //is eiles tikrina kiek vietu yra uzimta
        for (int i = 0; i < s.getSedimosVietos().length; i++) {
            if (s.getSedimosVietos()[i] == null) {
                return i;
            }
        }
        return 0;
    }

}
