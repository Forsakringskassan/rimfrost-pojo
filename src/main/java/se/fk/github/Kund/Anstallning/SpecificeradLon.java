package se.fk.github.Kund.Anstallning;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SpecificeradLon {
    private UUID id;
    private String version;
    private OffsetDateTime from;
    private OffsetDateTime tom;
    private Lonerad[] lonerader;
    private double lonesummaForPeriod;
    private Anstallning anstallning;

    public SpecificeradLon(UUID id, String version, OffsetDateTime from, OffsetDateTime tom, Lonerad[] lonerader, Anstallning anstallning)
    {
        this.id = id;
        this.version = version;
        this.from = from;
        this.tom = tom;
        this.lonerader = lonerader;
        this.anstallning = anstallning;
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

    public Lonerad[] getLonerader() {
        return lonerader;
    }

    public void setLonerader(Lonerad[] lonerader) {
        this.lonerader = lonerader;
    }

    public double getLonesummaForPeriod() {
        return lonesummaForPeriod;
    }

    public void setLonesummaForPeriod(double lonesummaForPeriod) {
        this.lonesummaForPeriod = lonesummaForPeriod;
    }

    public Anstallning getAnstallning() {
        return anstallning;
    }

    public void setAnstallning(Anstallning anstallning) {
        this.anstallning = anstallning;
    }
}
