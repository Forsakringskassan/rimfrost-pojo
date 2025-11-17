package se.fk.github.Kundbehov;

import se.fk.github.Produkt.Erbjudande;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Kundbehov {
    private UUID id;
    private String version;
    private OffsetDateTime kundbehovsdatum;
    private Kundbehovsstatus kundbehovsstatus;
    private OffsetDateTime period;
    private Avsikt avsikt;
    private String andringsorsak;
    private Kundbehovsflode kundbehovsflode;
    private RollIKundbehov rollIKundbehov;
    private Erbjudande  erbjudande;

    public Kundbehov(UUID id, String version, OffsetDateTime kundbehovsdatum, Kundbehovsstatus kundbehovsstatus, OffsetDateTime period, Avsikt avsikt,
                     String andringsorsak, Kundbehovsflode kundbehovsflode, RollIKundbehov rollIKundbehov,  Erbjudande erbjudande)
    {
        this.id = id;
        this.version = version;
        this.kundbehovsdatum = kundbehovsdatum;
        this.kundbehovsstatus = kundbehovsstatus;
        this.period = period;
        this.avsikt = avsikt;
        this.andringsorsak = andringsorsak;
        this.kundbehovsflode = kundbehovsflode;
        this.rollIKundbehov = rollIKundbehov;
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

    public OffsetDateTime getKundbehovsdatum() {
        return kundbehovsdatum;
    }

    public void setKundbehovsdatum(OffsetDateTime kundbehovsdatum) {
        this.kundbehovsdatum = kundbehovsdatum;
    }

    public Kundbehovsstatus getKundbehovsstatus() {
        return kundbehovsstatus;
    }

    public void setKundbehovsstatus(Kundbehovsstatus kundbehovsstatus) {
        this.kundbehovsstatus = kundbehovsstatus;
    }

    public OffsetDateTime getPeriod() {
        return period;
    }

    public void setPeriod(OffsetDateTime period) {
        this.period = period;
    }

    public Avsikt getAvsikt() {
        return avsikt;
    }

    public void setAvsikt(Avsikt avsikt) {
        this.avsikt = avsikt;
    }

    public String getAndringsorsak() {
        return andringsorsak;
    }

    public void setAndringsorsak(String andringsorsak) {
        this.andringsorsak = andringsorsak;
    }

    public Kundbehovsflode getKundbehovsflode() {
        return kundbehovsflode;
    }

    public void setKundbehovsflode(Kundbehovsflode kundbehovsflode) {
        this.kundbehovsflode = kundbehovsflode;
    }

    public RollIKundbehov getRollIKundbehov() {
        return rollIKundbehov;
    }

    public void setRollIKundbehov(RollIKundbehov rollIKundbehov) {
        this.rollIKundbehov = rollIKundbehov;
    }

    public Erbjudande getErbjudande() {
        return erbjudande;
    }

    public void setErbjudande(Erbjudande erbjudande) {
        this.erbjudande = erbjudande;
    }
}
