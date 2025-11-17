package se.fk.github.Regel;

import se.fk.github.Lag.Lagrum;

import java.util.UUID;

public class Regel {
    public UUID id;
    public String version;
    public Lagrum[] lagrum;

    public Regel(UUID id, String version,  Lagrum[] lagrum) {
        this.id = id;
        this.version = version;
        this.lagrum = lagrum;
    }
}
