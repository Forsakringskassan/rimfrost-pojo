package se.fk.github.Kundbehov;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Kundbehovsflode {
    private UUID id;
    private String version;
    private UUID processinstansId;
    private OffsetDateTime skapadTS;
    private OffsetDateTime avslutadTS;
    private Kundbehovsflodespecifikation kundbehovsspecifikation;

    public Kundbehovsflode(UUID id, String version, UUID processinstansId, OffsetDateTime skapadTS, Kundbehovsflodespecifikation kundbehovsflodespecifikation)
    {
        this.id = id;
        this.version = version;
        this.processinstansId = processinstansId;
        this.skapadTS = skapadTS;
        this.kundbehovsspecifikation = kundbehovsflodespecifikation;
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

    public UUID getProcessinstansId() {
        return processinstansId;
    }

    public void setProcessinstansId(UUID processinstansId) {
        this.processinstansId = processinstansId;
    }

    public OffsetDateTime getSkapadTS() {
        return skapadTS;
    }

    public void setSkapadTS(OffsetDateTime skapadTS) {
        this.skapadTS = skapadTS;
    }

    public OffsetDateTime getAvslutadTS() {
        return avslutadTS;
    }

    public void setAvslutadTS(OffsetDateTime avslutadTS) {
        this.avslutadTS = avslutadTS;
    }

    public Kundbehovsflodespecifikation getKundbehovsspecifikation() {
        return kundbehovsspecifikation;
    }

    public void setKundbehovsspecifikation(Kundbehovsflodespecifikation kundbehovsspecifikation) {
        this.kundbehovsspecifikation = kundbehovsspecifikation;
    }
}
