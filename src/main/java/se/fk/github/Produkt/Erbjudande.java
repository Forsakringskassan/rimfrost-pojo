package se.fk.github.Produkt;

import java.util.UUID;

public class Erbjudande {
    private UUID id;
    private String version;
    private String namn;

    public Erbjudande(UUID id, String version, String namn)
    {
        this.id = id;
        this.version = version;
        this.namn = namn;
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
}
