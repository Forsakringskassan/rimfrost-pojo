package se.fk.github.Ersattning;

import se.fk.github.Kund.Individ;
import se.fk.github.Uppgift.Uppgiftsstatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class ProduceratResultat {
    private UUID id;
    private String version;
    private OffsetDateTime from;
    private OffsetDateTime tom;
    private Uppgiftsstatus status;
    private Individ individ;

    public ProduceratResultat(){}

    public ProduceratResultat(UUID id, String version, OffsetDateTime from, OffsetDateTime tom, Uppgiftsstatus status, Individ individ)
    {
        this.id = id;
        this.version = version;
        this.from = from;
        this.tom = tom;
        this.status = status;
        this.individ = individ;
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

    public Uppgiftsstatus getStatus() {
        return status;
    }

    public void setStatus(Uppgiftsstatus status) {
        this.status = status;
    }

    public Individ getIndivid() {
        return individ;
    }

    public void setIndivid(Individ individ) {
        this.individ = individ;
    }
}
