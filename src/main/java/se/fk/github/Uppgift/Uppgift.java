package se.fk.github.Uppgift;

import se.fk.github.Regel.Utfall.Regelutfall;
import se.fk.github.Uppgiftsdata.Uppgiftsdata;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Uppgift extends Basuppgift{
    private OffsetDateTime planeradTillTS;
    private OffsetDateTime utfordTS;
    private Uppgiftsstatus uppgiftsstatus;
    private String aktivitet;
    private FSSAInformation fssaInformation;
    private Uppgiftsdata[] underlag;
    private Uppgiftsdata[] resultat;
    private Regelutfall regelutfall;
    private Uppgiftspecifikation uppgiftspecifikation;

    public Uppgift(UUID id, String version, OffsetDateTime skapadTS, String utforarId, OffsetDateTime planeradTillTS, Uppgiftsstatus uppgiftsstatus,
                   String aktivitet, FSSAInformation fssaInformation, Uppgiftsdata[] underlag, Uppgiftsdata[] resultat, Uppgiftspecifikation uppgiftspecifikation)
    {
        super(id, version, skapadTS, utforarId);
        this.planeradTillTS = planeradTillTS;
        this.uppgiftsstatus = uppgiftsstatus;
        this.aktivitet = aktivitet;
        this.fssaInformation = fssaInformation;
        this.underlag = underlag;
        this.resultat = resultat;
        this.uppgiftspecifikation = uppgiftspecifikation;
    }

    public OffsetDateTime getPlaneradTillTS() {
        return planeradTillTS;
    }

    public void setPlaneradTillTS(OffsetDateTime planeradTillTS) {
        this.planeradTillTS = planeradTillTS;
    }

    public OffsetDateTime getUtfordTS() {
        return utfordTS;
    }

    public void setUtfordTS(OffsetDateTime utfordTS) {
        this.utfordTS = utfordTS;
    }

    public Uppgiftsstatus getUppgiftsstatus() {
        return uppgiftsstatus;
    }

    public void setUppgiftsstatus(Uppgiftsstatus uppgiftsstatus) {
        this.uppgiftsstatus = uppgiftsstatus;
    }

    public String getAktivitet() {
        return aktivitet;
    }

    public void setAktivitet(String aktivitet) {
        this.aktivitet = aktivitet;
    }

    public FSSAInformation getFssaInformation() {
        return fssaInformation;
    }

    public void setFssaInformation(FSSAInformation fssaInformation) {
        this.fssaInformation = fssaInformation;
    }

    public Uppgiftsdata[] getUnderlag() {
        return underlag;
    }

    public void setUnderlag(Uppgiftsdata[] underlag) {
        this.underlag = underlag;
    }

    public Uppgiftsdata[] getResultat() {
        return resultat;
    }

    public void setResultat(Uppgiftsdata[] resultat) {
        this.resultat = resultat;
    }

    public Regelutfall getRegelutfall() {
        return regelutfall;
    }

    public void setRegelutfall(Regelutfall regelutfall) {
        this.regelutfall = regelutfall;
    }

    public Uppgiftspecifikation getUppgiftspecifikation() {
        return uppgiftspecifikation;
    }

    public void setUppgiftspecifikation(Uppgiftspecifikation uppgiftspecifikation) {
        this.uppgiftspecifikation = uppgiftspecifikation;
    }
}
