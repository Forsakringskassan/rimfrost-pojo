package se.fk.github.Kundbehov;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Kundbehovsflode {
    public UUID id;
    public String version;
    public UUID processinstansId;
    public OffsetDateTime skapadTS;
    public OffsetDateTime avslutadTS;
    public Kundbehovsflodespecifikation kundbehovsspecifikation;

    public Kundbehovsflode(UUID id, String version, UUID processinstansId, OffsetDateTime skapadTS, Kundbehovsflodespecifikation kundbehovsflodespecifikation)
    {
        this.id = id;
        this.version = version;
        this.processinstansId = processinstansId;
        this.skapadTS = skapadTS;
        this.kundbehovsspecifikation = kundbehovsflodespecifikation;
    }
}
