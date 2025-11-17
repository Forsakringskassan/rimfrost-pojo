package se.fk.github.Regel.Lag;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Lagrum {
    private UUID id;
    private String version;
    private OffsetDateTime giltigFrom;
    private OffsetDateTime giltigTom;
    private String forfattning;
    private String kapitel;
    private String paragraf;
    private String stycke;
    private String punkt;

    public Lagrum(UUID id, String version, OffsetDateTime giltigFrom, OffsetDateTime giltigTom, String forfattning, String kapitel, String paragraf, String stycke, String punkt)
    {
        this.id = id;
        this.version = version;
        this.giltigFrom = giltigFrom;
        this.giltigTom = giltigTom;
        this.forfattning = forfattning;
        this.kapitel = kapitel;
        this.paragraf = paragraf;
        this.stycke = stycke;
        this.punkt = punkt;
    }

    public UUID getId() {return id;}
    public String getVersion() {return version;}
    public OffsetDateTime getGiltigFrom() {return giltigFrom;}
    public OffsetDateTime getGiltigTom() {return giltigTom;}
    public String getForfattning() {return forfattning;}
    public String getKapitel() {return kapitel;}
    public String getParagraf() {return paragraf;}
    public String getStycke() {return stycke;}
    public String getPunkt() {return punkt;}

    public void setVersion(String version) {this.version = version;}
    public void setGiltigFrom(OffsetDateTime from) {this.giltigFrom = from;}
    public void setGiltigTom(OffsetDateTime to) {this.giltigTom = to;}
    public void setForfattning(String forfattning) {this.forfattning = forfattning;}
    public void setKapitel(String kapitel) {this.kapitel = kapitel;}
    public void setParagraf(String paragraf) {this.paragraf = paragraf;}
    public void setStycke(String stycke) {this.stycke = stycke;}
    public void setPunkt(String punkt) {this.punkt = punkt;}
}
