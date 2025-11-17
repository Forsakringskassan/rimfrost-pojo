package se.fk.github.Uppgiftsdata;

import java.util.UUID;

public class Uppgiftsdata {
    public Informationsobjekt informationsobjekt;
    public UUID informationsobjektsId;
    public String informationsobjektsVersion;

    public Uppgiftsdata(Informationsobjekt informationsobjekt)
    {
        this.informationsobjekt = informationsobjekt;
        this.informationsobjektsId = informationsobjekt.id;
        this.informationsobjektsVersion = informationsobjekt.version;
    }
}
