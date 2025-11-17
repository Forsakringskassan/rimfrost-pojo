package se.fk.github.Kund.Anstallning;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SpecificeradLon {
    public UUID id;
    public String version;
    public OffsetDateTime from;
    public OffsetDateTime tom;
    public Lonerad[] lonerader;
    public int lonesummaForPeriod;

    public SpecificeradLon(UUID id, String version, OffsetDateTime from, OffsetDateTime tom, Lonerad[] lonerader)
    {
        this.id = id;
        this.version = version;
        this.from = from;
        this.tom = tom;
        this.lonerader = lonerader;
    }
}
