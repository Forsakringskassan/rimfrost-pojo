package se.fk.github.Kund;

import se.fk.github.Kundbehov.RollIKundbehov;

import java.util.UUID;

public class Individ {
    private UUID id;
    private String version;
    private RollIKundbehov rollIKundbehov;

    public Individ(){}

    public Individ(UUID id, String version)
    {
        this.id = id;
        this.version = version;
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

    public RollIKundbehov getRollIKundbehov() {
        return rollIKundbehov;
    }

    public void setRollIKundbehov(RollIKundbehov rollIKundbehov) {
        this.rollIKundbehov = rollIKundbehov;
    }
}
