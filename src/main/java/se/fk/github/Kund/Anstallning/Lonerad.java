package se.fk.github.Kund.Anstallning;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Lonerad {
    public UUID id;
    public String version;
    public LoneradTyp loneradTyp;
    public OffsetDateTime from;
    public OffsetDateTime tom;
    public int belopp;

    public Lonerad(UUID id, String version, LoneradTyp loneradTyp, OffsetDateTime from, OffsetDateTime tom)
    {
        this.id = id;
        this.version = version;
        this.loneradTyp = loneradTyp;
        this.from = from;
        this.tom = tom;
    }
}
