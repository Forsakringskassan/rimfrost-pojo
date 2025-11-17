package se.fk.github.Kund;

import se.fk.github.Kund.Folkbokforing.Adress;
import se.fk.github.Kundbehov.RollIKundbehov;

import java.util.UUID;

public class FysiskPerson extends Individ{
    private String personnummer;
    private String fornamn;
    private String efternamn;
    private Kon kon;
    private RollIKundbehov rollIKundbehov;
    private Adress adress;

    public FysiskPerson(UUID id, String version, String personnummer, String fornamn, String efternamn, Kon kon, Adress adress)
    {
        super(id, version);
        this.personnummer = personnummer;
        this.fornamn = fornamn;
        this.efternamn = efternamn;
        this.kon = kon;
        this.adress = adress;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getFornamn() {
        return fornamn;
    }

    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public Kon getKon() {
        return kon;
    }

    public void setKon(Kon kon) {
        this.kon = kon;
    }

    public RollIKundbehov getRollIKundbehov() {
        return rollIKundbehov;
    }

    public void setRollIKundbehov(RollIKundbehov rollIKundbehov) {
        this.rollIKundbehov = rollIKundbehov;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
