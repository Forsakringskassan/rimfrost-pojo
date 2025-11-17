package se.fk.github.Kundbehov;

import se.fk.github.Uppgift.Uppgiftspecifikation;

import java.util.UUID;

public class Kundbehovsflodespecifikation {
    public UUID id;
    public String version;
    public String bpmn;
    public String namn;
    public String beskrivning;
    public Uppgiftspecifikation[] uppgiftspecifikation;

    public Kundbehovsflodespecifikation(UUID id, String version, String bpmn, String namn, String beskrivning, Uppgiftspecifikation[] uppgiftspecifikation)
    {
        this.id = id;
        this.version = version;
        this.bpmn = bpmn;
        this.namn = namn;
        this.beskrivning = beskrivning;
        this.uppgiftspecifikation = uppgiftspecifikation;
    }
}
