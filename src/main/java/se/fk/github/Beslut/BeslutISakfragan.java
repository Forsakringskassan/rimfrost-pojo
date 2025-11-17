package se.fk.github.Beslut;

import se.fk.github.Kundbehov.Kundbehov;

import java.time.OffsetDateTime;
import java.util.UUID;

public class BeslutISakfragan extends Beslut{
    private Beslutstyper beslutstyp;
    private Beslutsutfall beslutsutfall;
    private String avslagsanledning;
    private Kundbehov kundbehov;

    public BeslutISakfragan(){}

    public BeslutISakfragan(UUID id, String version, OffsetDateTime beslutsdatum, String beslutsfattareId, BeslutandeOrganisation beslutandeOrganisation,
                            BeslutEnligtLagrum beslutEnligtLagrum, Beslutstyper beslutstyp, Beslutsutfall beslutsutfall, String avslagsanledning, Kundbehov kundbehov)
    {
        super(id, version, beslutsdatum, beslutsfattareId, beslutandeOrganisation, beslutEnligtLagrum);
        this.beslutstyp = beslutstyp;
        this.beslutsutfall = beslutsutfall;
        this.avslagsanledning = avslagsanledning;
        this.kundbehov = kundbehov;
    }

    public Beslutstyper getBeslutstyp() {
        return beslutstyp;
    }

    public void setBeslutstyp(Beslutstyper beslutstyp) {
        this.beslutstyp = beslutstyp;
    }

    public Beslutsutfall getBeslutsutfall() {
        return beslutsutfall;
    }

    public void setBeslutsutfall(Beslutsutfall beslutsutfall) {
        this.beslutsutfall = beslutsutfall;
    }

    public String getAvslagsanledning() {
        return avslagsanledning;
    }

    public void setAvslagsanledning(String avslagsanledning) {
        this.avslagsanledning = avslagsanledning;
    }

    public Kundbehov getKundbehov() {
        return kundbehov;
    }

    public void setKundbehov(Kundbehov kundbehov) {
        this.kundbehov = kundbehov;
    }
}
