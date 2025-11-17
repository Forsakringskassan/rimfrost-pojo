package se.fk.github.Abstrakt;

import se.fk.github.Kundbehov.Kundbehovsflodespecifikation;

import java.util.UUID;

public class AbstraktProcessbreskrivning {
    private UUID id;
    private String version;
    private String abstraktBpmnProcessBeskrivning;
    private Kundbehovsflodespecifikation kundbehovsflodespecifikation;
    private Aktivitet[]  aktivitet;

    public AbstraktProcessbreskrivning(UUID id, String version, String abstraktBpmnProcessBeskrivning, Kundbehovsflodespecifikation kundbehovsflodespecifikation, Aktivitet[] aktivitet)
    {
        this.id = id;
        this.version = version;
        this.abstraktBpmnProcessBeskrivning = abstraktBpmnProcessBeskrivning;
        this.kundbehovsflodespecifikation = kundbehovsflodespecifikation;
        this.aktivitet = aktivitet;
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

    public String getAbstraktBpmnProcessBeskrivning() {
        return abstraktBpmnProcessBeskrivning;
    }

    public void setAbstraktBpmnProcessBeskrivning(String abstraktBpmnProcessBeskrivning) {
        this.abstraktBpmnProcessBeskrivning = abstraktBpmnProcessBeskrivning;
    }

    public Kundbehovsflodespecifikation getKundbehovsflodespecifikation() {
        return kundbehovsflodespecifikation;
    }

    public void setKundbehovsflodespecifikation(Kundbehovsflodespecifikation kundbehovsflodespecifikation) {
        this.kundbehovsflodespecifikation = kundbehovsflodespecifikation;
    }

    public Aktivitet[] getAktivitet() {
        return aktivitet;
    }

    public void setAktivitet(Aktivitet[] aktivitet) {
        this.aktivitet = aktivitet;
    }
}
