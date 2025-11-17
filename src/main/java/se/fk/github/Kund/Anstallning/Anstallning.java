package se.fk.github.Kund.Anstallning;

import se.fk.github.Kund.FysiskPerson;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Anstallning {
    private UUID id;
    private String version;
    private int arbetstid;
    private OffsetDateTime anstallningsdag;
    private OffsetDateTime sista_anstallningsdag;
    private FysiskPerson fysiskPerson;
    private Organisation organisation;

    public Anstallning(UUID id, String version, int arbetstid, OffsetDateTime anstallningsdag, FysiskPerson fysiskPerson,  Organisation organisation)
    {
        this.id = id;
        this.version = version;
        this.arbetstid = arbetstid;
        this.anstallningsdag = anstallningsdag;
        this.fysiskPerson = fysiskPerson;
        this.organisation = organisation;
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

    public int getArbetstid() {
        return arbetstid;
    }

    public void setArbetstid(int arbetstid) {
        this.arbetstid = arbetstid;
    }

    public OffsetDateTime getAnstallningsdag() {
        return anstallningsdag;
    }

    public void setAnstallningsdag(OffsetDateTime anstallningsdag) {
        this.anstallningsdag = anstallningsdag;
    }

    public OffsetDateTime getSista_anstallningsdag() {
        return sista_anstallningsdag;
    }

    public void setSista_anstallningsdag(OffsetDateTime sista_anstallningsdag) {
        this.sista_anstallningsdag = sista_anstallningsdag;
    }

    public FysiskPerson getFysiskPerson() {
        return fysiskPerson;
    }

    public void setFysiskPerson(FysiskPerson fysiskPerson) {
        this.fysiskPerson = fysiskPerson;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }
}
