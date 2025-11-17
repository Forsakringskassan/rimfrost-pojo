package se.fk.github.Abstrakt;

import se.fk.github.Kundbehov.Kundbehovsflodespecifikation;

import java.util.UUID;

public class AbstraktProcessbreskrivning {
    public UUID id;
    public String version;
    public String abstraktBpmnProcessBeskrivning;
    public Kundbehovsflodespecifikation kundbehovsflodespecifikation;
    public Aktivitet[]  aktivitet;

    public AbstraktProcessbreskrivning(UUID id, String version, String abstraktBpmnProcessBeskrivning, Kundbehovsflodespecifikation kundbehovsflodespecifikation, Aktivitet[] aktivitet)
    {
        this.id = id;
        this.version = version;
        this.abstraktBpmnProcessBeskrivning = abstraktBpmnProcessBeskrivning;
        this.kundbehovsflodespecifikation = kundbehovsflodespecifikation;
        this.aktivitet = aktivitet;
    }
}
