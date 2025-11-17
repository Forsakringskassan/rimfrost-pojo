package se.fk.github.Lag;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Lagrum {
    public UUID id;
    public String version;
    public OffsetDateTime giltigFrom;
    public OffsetDateTime giltigTom;
    public String forfattning;
    public String kapitel;
    public String paragraf;
    public String stycke;
    public String punkt;

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
}
