package se.fk.github.Kundbehov;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Kundbehov {
    public UUID id;
    public String version;
    public OffsetDateTime kundbehovsdatum;
    public Kundbehovsstatus kundbehovsstatus;
    public OffsetDateTime period;
    public Avsikt avsikt;
    public String andringsorsak;

    public Kundbehov(UUID id, String version, OffsetDateTime kundbehovsdatum, Kundbehovsstatus kundbehovsstatus, OffsetDateTime period, Avsikt avsikt, String andringsorsak)
    {
        this.id = id;
        this.version = version;
        this.kundbehovsdatum = kundbehovsdatum;
        this.kundbehovsstatus = kundbehovsstatus;
        this.period = period;
        this.avsikt = avsikt;
        this.andringsorsak = andringsorsak;
    }
}
