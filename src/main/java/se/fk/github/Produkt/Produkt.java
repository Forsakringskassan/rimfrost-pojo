package se.fk.github.Produkt;

import java.util.UUID;

public class Produkt {
    private UUID id;
    private String version;
    private String namn;
    private Erbjudande[] erbjudande;

    public Produkt(UUID id, String version, String namn, Erbjudande[] erbjudande)
    {
        this.id = id;
        this.version = version;
        this.namn = namn;
        this.erbjudande = erbjudande;
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

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public Erbjudande[] getErbjudande() {
        return erbjudande;
    }

    public void setErbjudande(Erbjudande[] erbjudande) {
        this.erbjudande = erbjudande;
    }
}
