package com.erika.prj.ksr;

public class Rezervacija {

    private Seansas seansas;
    private boolean apmoketa;

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

    public boolean isApmoketa() {
        return apmoketa;
    }

    public void setApmoketa(boolean apmoketa) {
        this.apmoketa = apmoketa;
    }
}
