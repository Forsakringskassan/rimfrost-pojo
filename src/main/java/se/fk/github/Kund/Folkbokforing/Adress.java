package se.fk.github.Kund.Folkbokforing;

import java.util.UUID;

public class Adress extends Folkbokforingsadress {
    private UUID id;
    private String version;

    public Adress(String careOf, String utdelningsadress1, String utdelningsadress2, String postnummer, String postort, UUID id, String version)
    {
        super(careOf, utdelningsadress1, utdelningsadress2, postnummer, postort);
        this.id = id;
        this.version = version;
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
}
