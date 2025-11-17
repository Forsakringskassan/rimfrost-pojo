package se.fk.github.Kund.Anstallning;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Lonerad {
    private UUID id;
    private String version;
    private LoneradTyp loneradTyp;
    private OffsetDateTime from;
    private OffsetDateTime tom;
    private double belopp;
    private SpecificeradLon specificeradLon;

    public Lonerad(UUID id, String version, LoneradTyp loneradTyp, OffsetDateTime from, OffsetDateTime tom, SpecificeradLon specificeradLon)
    {
        this.id = id;
        this.version = version;
        this.loneradTyp = loneradTyp;
        this.from = from;
        this.tom = tom;
        this.specificeradLon = specificeradLon;
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

    public LoneradTyp getLoneradTyp() {
        return loneradTyp;
    }

    public void setLoneradTyp(LoneradTyp loneradTyp) {
        this.loneradTyp = loneradTyp;
    }

    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public OffsetDateTime getTom() {
        return tom;
    }

    public void setTom(OffsetDateTime tom) {
        this.tom = tom;
    }

    public double getBelopp() {
        return belopp;
    }

    public void setBelopp(double belopp) {
        this.belopp = belopp;
    }

    public SpecificeradLon getSpecificeradLon() {
        return specificeradLon;
    }

    public void setSpecificeradLon(SpecificeradLon specificeradLon) {
        this.specificeradLon = specificeradLon;
    }
}
