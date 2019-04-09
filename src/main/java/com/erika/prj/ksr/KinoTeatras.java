package com.erika.prj.ksr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KinoTeatras {

    private List<Seansas> repertuaras = new ArrayList<Seansas>();

    public List<Seansas> getRepertuaras() {
        return repertuaras;
    }

    public List<Seansas> rodytiSeansus(boolean rodytiVisus) {
        List<Seansas> rodytiSeansuSarasa = new ArrayList<Seansas>();

        if (rodytiVisus = true) {
            return rodytiSeansuSarasa;
        } else {return null;
        }
    }

    // susikurti nauja lista. metodas turi grazinti lista seansu. isideti boolean.
    // jeigu true - bus rodomi visi ir tie kur ivyko, o jeigu false - rodo tik busimus;

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

        //ieskoti konkretaus filmo ir susideti kiek buvo ispirkta bilietu (panaudoti map'a) ir isrikiuoti;

        return null;
    }

}
