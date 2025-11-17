package se.fk.github.Beslut;

import se.fk.github.Uppgift.Basuppgift;

public class Forfarandebeslut extends BeslutISakfragan {
    public Beslutstyper beslutstyp;

    public Forfarandebeslut(Beslutstyper beslutstyp)
    {
        this.beslutstyp = beslutstyp;
    }
}
