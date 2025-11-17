package se.fk.github.Uppgift;

import se.fk.github.Kundbehov.Roll;
import se.fk.github.Regel.Regel;

import java.util.UUID;

public class Uppgiftspecifikation {
    private UUID id;
    private String version;
    private String namn;
    private String uppgiftbeskrivning;
    private Verksamhetslogik verksamhetslogik;
    private Roll roll;
    private String applikationsId;
    private String applikationsVersion;
    private Regel[] regel;
    private String uppgiftsGui;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getUppgiftbeskrivning() {
        return uppgiftbeskrivning;
    }

    public void setUppgiftbeskrivning(String uppgiftbeskrivning) {
        this.uppgiftbeskrivning = uppgiftbeskrivning;
    }

    public Verksamhetslogik getVerksamhetslogik() {
        return verksamhetslogik;
    }

    public void setVerksamhetslogik(Verksamhetslogik verksamhetslogik) {
        this.verksamhetslogik = verksamhetslogik;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }

    public String getApplikationsId() {
        return applikationsId;
    }

    public void setApplikationsId(String applikationsId) {
        this.applikationsId = applikationsId;
    }

    public String getApplikationsVersion() {
        return applikationsVersion;
    }

    public void setApplikationsVersion(String applikationsVersion) {
        this.applikationsVersion = applikationsVersion;
    }

    public Regel[] getRegel() {
        return regel;
    }

    public void setRegel(Regel[] regel) {
        this.regel = regel;
    }

    public String getUppgiftsGui() {
        return uppgiftsGui;
    }

    public void setUppgiftsGui(String uppgiftsGui) {
        this.uppgiftsGui = uppgiftsGui;
    }

    public UUID getId() {
        return id;
    }
}
