package se.fk.github.Kundbehov;

import se.fk.github.Uppgift.Uppgiftspecifikation;

import java.util.UUID;

public class Kundbehovsflodespecifikation {
    private UUID id;
    private String version;
    private String bpmn;
    private String namn;
    private String beskrivning;
    private Uppgiftspecifikation[] uppgiftspecifikation;

    public Kundbehovsflodespecifikation(UUID id, String version, String bpmn, String namn, String beskrivning, Uppgiftspecifikation[] uppgiftspecifikation)
    {
        this.id = id;
        this.version = version;
        this.bpmn = bpmn;
        this.namn = namn;
        this.beskrivning = beskrivning;
        this.uppgiftspecifikation = uppgiftspecifikation;
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

    public String getBpmn() {
        return bpmn;
    }

    public void setBpmn(String bpmn) {
        this.bpmn = bpmn;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public Uppgiftspecifikation[] getUppgiftspecifikation() {
        return uppgiftspecifikation;
    }

    public void setUppgiftspecifikation(Uppgiftspecifikation[] uppgiftspecifikation) {
        this.uppgiftspecifikation = uppgiftspecifikation;
    }
}
