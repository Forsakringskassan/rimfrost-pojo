package se.fk.github.Uppgiftsdata;

import java.util.UUID;

public class Uppgiftsdata {
    private Informationsobjekt informationsobjekt;

    public Uppgiftsdata(Informationsobjekt informationsobjekt)
    {
        this.informationsobjekt = informationsobjekt;
    }

    public Informationsobjekt getInformationsobjekt() {
        return informationsobjekt;
    }

    public void setInformationsobjekt(Informationsobjekt informationsobjekt) {
        this.informationsobjekt = informationsobjekt;
    }
}
