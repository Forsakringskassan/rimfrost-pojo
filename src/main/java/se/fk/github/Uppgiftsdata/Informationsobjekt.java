package se.fk.github.Uppgiftsdata;

import java.util.UUID;

public class Informationsobjekt {
    public UUID id;
    public String version;
    public Object informationsobjekt;

    public Informationsobjekt(UUID id, String version, Object informationsobjekt)
    {
        this.id = id;
        this.version = version;
        this.informationsobjekt = informationsobjekt;
    }
}
