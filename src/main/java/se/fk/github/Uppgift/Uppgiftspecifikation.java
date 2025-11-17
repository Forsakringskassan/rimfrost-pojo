package se.fk.github.Uppgift;

import se.fk.github.Kundbehov.Roll;
import se.fk.github.Regel.Regel;

import java.util.UUID;

public class Uppgiftspecifikation {
    public UUID id;
    public String version;
    public String namn;
    public String uppgiftbeskrivning;
    public Verksamhetslogik verksamhetslogik;
    public Roll roll;
    public String applikationsId;
    public String applikationsVersion;
    public Regel[] regel;
    public String uppgiftsGui;

    public Uppgiftspecifikation(UUID id, String  version, String namn, String uppgiftbeskrivning, Verksamhetslogik verksamhetslogik, Roll roll, String applikationsId, String applikationsVersion, Regel[] regel, String uppgiftsGui)
    {
        this.id = id;
        this.version = version;
        this.namn = namn;
        this.uppgiftbeskrivning = uppgiftbeskrivning;
        this.verksamhetslogik = verksamhetslogik;
        this.roll = roll;
        this.applikationsId = applikationsId;
        this.applikationsVersion = applikationsVersion;
        this.regel = regel;
        this.uppgiftsGui = uppgiftsGui;
    }
}
