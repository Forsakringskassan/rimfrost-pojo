package se.fk.github.Regel;

import se.fk.github.Regel.Lag.Lagrum;

import java.util.UUID;

public class Regel {
    private UUID id;
    private String version;
    private Lagrum[] lagrum;

    public Regel(UUID id, String version,  Lagrum[] lagrum) {
        this.id = id;
        this.version = version;
        this.lagrum = lagrum;
    }

    public UUID  getId() {return id;}
    public String getVersion() {return version;}
    public Lagrum[] getLagrum() {return lagrum;}

    public void setVersion(String version) {this.version = version;}
    public void setLagrum(Lagrum[] lagrum) {this.lagrum = lagrum;}
}
