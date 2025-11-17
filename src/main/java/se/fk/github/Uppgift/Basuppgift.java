package se.fk.github.Uppgift;

import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class Basuppgift {
    private UUID id;
    private String version;
    private OffsetDateTime skapadTS;
    private String utforarId;

    public Basuppgift(){}

    public Basuppgift(UUID id, String version, OffsetDateTime skapadTS, String utforarId)
    {
        this.id = id;
        this.version = version;
        this.skapadTS = skapadTS;
        this.utforarId = utforarId;
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

    public OffsetDateTime getSkapadTS() {
        return skapadTS;
    }

    public void setSkapadTS(OffsetDateTime skapadTS) {
        this.skapadTS = skapadTS;
    }

    public String getUtforarId() {
        return utforarId;
    }

    public void setUtforarId(String utforarId) {
        this.utforarId = utforarId;
    }
}
