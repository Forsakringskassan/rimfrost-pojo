package se.fk.github.Uppgift;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Tjansteanteckning extends Basuppgift{
    private String rubrik;
    private String anteckning;

    public Tjansteanteckning(UUID id, String version, OffsetDateTime skapadTS, String utforarId, String rubrik, String anteckning)
    {
        super(id,version,skapadTS,utforarId);
        this.rubrik=rubrik;
        this.anteckning=anteckning;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public String getAnteckning() {
        return anteckning;
    }

    public void setAnteckning(String anteckning) {
        this.anteckning = anteckning;
    }
}
