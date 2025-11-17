package se.fk.github.Kund.Anstallning;

import java.util.UUID;

public class Organisation {
    private UUID id;
    private String version;
    private String organisationsnummer;
    private String organisationsnamn;

    public Organisation(UUID id, String version, String organisationsnummer, String organisationsnamn)
    {
        this.id = id;
        this.version = version;
        this.organisationsnummer = organisationsnummer;
        this.organisationsnamn = organisationsnamn;
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

    public String getOrganisationsnummer() {
        return organisationsnummer;
    }

    public void setOrganisationsnummer(String organisationsnummer) {
        this.organisationsnummer = organisationsnummer;
    }

    public String getOrganisationsnamn() {
        return organisationsnamn;
    }

    public void setOrganisationsnamn(String organisationsnamn) {
        this.organisationsnamn = organisationsnamn;
    }
}
