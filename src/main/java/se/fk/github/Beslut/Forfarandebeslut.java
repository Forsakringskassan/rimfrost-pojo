package se.fk.github.Beslut;

import se.fk.github.Uppgift.Basuppgift;

public class Forfarandebeslut extends BeslutISakfragan {
    private Beslutstyper beslutstyp;

    public Forfarandebeslut(Beslutstyper beslutstyp)
    {
        this.beslutstyp = beslutstyp;
    }

    @Override
    public Beslutstyper getBeslutstyp() {
        return beslutstyp;
    }

    @Override
    public void setBeslutstyp(Beslutstyper beslutstyp) {
        this.beslutstyp = beslutstyp;
    }
}
