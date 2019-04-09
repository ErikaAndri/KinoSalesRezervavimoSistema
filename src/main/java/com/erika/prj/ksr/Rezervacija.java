package com.erika.prj.ksr;

public class Rezervacija {

    private Seansas seansas;
    private boolean apmoketa;

    // galima dar priskirti rezervacijos ID, kad vartotojas gautu numeriuka, pagal kuri galima patikrinti

    public Rezervacija(Seansas seansas, boolean apmoketa) {
        this.seansas = seansas;
        this.apmoketa = apmoketa;
    }

    public Seansas getSeansas() {
        return seansas;
    }

    public void setSeansas(Seansas seansas) {
        this.seansas = seansas;
    }

    public boolean Apmoketa() {
        return apmoketa;
    }

    public void setApmoketa(boolean apmoketa) {
        this.apmoketa = apmoketa;
    }
}
