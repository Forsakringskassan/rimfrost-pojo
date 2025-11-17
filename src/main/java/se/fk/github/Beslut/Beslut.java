package se.fk.github.Beslut;

import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class Beslut {
    private UUID id;
    private String version;
    private OffsetDateTime beslutsdatum;
    private String beslutsfattareId;
    private BeslutandeOrganisation beslutsfattandeOrganisation;
    private BeslutEnligtLagrum beslutEnligtLagrum;

    public Beslut(){}

    public Beslut(UUID id, String version, OffsetDateTime beslutsdatum, String beslutsfattareId, BeslutandeOrganisation beslutandeOrganisation, BeslutEnligtLagrum beslutEnligtLagrum)
    {
        this.id = id;
        this.version = version;
        this.beslutsdatum = beslutsdatum;
        this.beslutsfattareId = beslutsfattareId;
        this.beslutsfattandeOrganisation = beslutandeOrganisation;
        this.beslutEnligtLagrum = beslutEnligtLagrum;
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

    public OffsetDateTime getBeslutsdatum() {
        return beslutsdatum;
    }

    public void setBeslutsdatum(OffsetDateTime beslutsdatum) {
        this.beslutsdatum = beslutsdatum;
    }

    public String getBeslutsfattareId() {
        return beslutsfattareId;
    }

    public void setBeslutsfattareId(String beslutsfattareId) {
        this.beslutsfattareId = beslutsfattareId;
    }

    public BeslutandeOrganisation getBeslutsfattandeOrganisation() {
        return beslutsfattandeOrganisation;
    }

    public void setBeslutsfattandeOrganisation(BeslutandeOrganisation beslutsfattandeOrganisation) {
        this.beslutsfattandeOrganisation = beslutsfattandeOrganisation;
    }

    public BeslutEnligtLagrum getBeslutEnligtLagrum() {
        return beslutEnligtLagrum;
    }

    public void setBeslutEnligtLagrum(BeslutEnligtLagrum beslutEnligtLagrum) {
        this.beslutEnligtLagrum = beslutEnligtLagrum;
    }
}
