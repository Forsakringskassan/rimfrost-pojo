package se.fk.github.Uppgiftsdata;

import java.util.UUID;

public class Informationsobjekt {
    private UUID id;
    private String version;
    private Object informationsobjekt;

    public Informationsobjekt(UUID id, String version, Object informationsobjekt)
    {
        this.id = id;
        this.version = version;
        this.informationsobjekt = informationsobjekt;
    }

    public UUID getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Object getInformationsobjekt() {
        return informationsobjekt;
    }

    public void setInformationsobjekt(Object informationsobjekt) {
        this.informationsobjekt = informationsobjekt;
    }
}
