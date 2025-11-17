package se.fk.github.Ersattning;

import se.fk.github.Beslut.Beslutsutfall;
import se.fk.github.Kund.Individ;
import se.fk.github.Kundbehov.Kundbehov;
import se.fk.github.Uppgift.Uppgiftsstatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Ersattning extends ProduceratResultat{
    private double belopp;
    private ErsattningstypEnligtLagrum  ersattningstyp;
    private BerakningsgrundBaseratPaErsattningstypEnligtLagrum berakningsgrund;
    private BeloppstypBaseratPaErsattningstypEnligtLagrum beloppstyp;
    private Periodisering periodisering;
    private OmfattningBaseratPaErsattningstypEnligtLagrum omfattning;
    private Beslutsutfall beslutsutfall;
    private String avslagninsanledning;
    private Kundbehov kundbehov;

    public Ersattning(UUID id, String version, OffsetDateTime from, OffsetDateTime tom, Uppgiftsstatus status, Individ individ, double belopp, ErsattningstypEnligtLagrum ersattningstyp, BerakningsgrundBaseratPaErsattningstypEnligtLagrum berakningsgrund,
                      BeloppstypBaseratPaErsattningstypEnligtLagrum beloppstyp, Periodisering periodisering, OmfattningBaseratPaErsattningstypEnligtLagrum omfattning,
                      Beslutsutfall beslutsutfall, Kundbehov kundbehov)
    {
        super(id, version, from, tom, status, individ);
        this.belopp = belopp;
        this.ersattningstyp = ersattningstyp;
        this.berakningsgrund = berakningsgrund;
        this.beloppstyp = beloppstyp;
        this.periodisering = periodisering;
        this.omfattning = omfattning;
        this.beslutsutfall = beslutsutfall;
        this.kundbehov = kundbehov;
    }

    public double getBelopp() {
        return belopp;
    }

    public void setBelopp(double belopp) {
        this.belopp = belopp;
    }

    public ErsattningstypEnligtLagrum getErsattningstyp() {
        return ersattningstyp;
    }

    public void setErsattningstyp(ErsattningstypEnligtLagrum ersattningstyp) {
        this.ersattningstyp = ersattningstyp;
    }

    public BerakningsgrundBaseratPaErsattningstypEnligtLagrum getBerakningsgrund() {
        return berakningsgrund;
    }

    public void setBerakningsgrund(BerakningsgrundBaseratPaErsattningstypEnligtLagrum berakningsgrund) {
        this.berakningsgrund = berakningsgrund;
    }

    public BeloppstypBaseratPaErsattningstypEnligtLagrum getBeloppstyp() {
        return beloppstyp;
    }

    public void setBeloppstyp(BeloppstypBaseratPaErsattningstypEnligtLagrum beloppstyp) {
        this.beloppstyp = beloppstyp;
    }

    public Periodisering getPeriodisering() {
        return periodisering;
    }

    public void setPeriodisering(Periodisering periodisering) {
        this.periodisering = periodisering;
    }

    public OmfattningBaseratPaErsattningstypEnligtLagrum getOmfattning() {
        return omfattning;
    }

    public void setOmfattning(OmfattningBaseratPaErsattningstypEnligtLagrum omfattning) {
        this.omfattning = omfattning;
    }

    public Beslutsutfall getBeslutsutfall() {
        return beslutsutfall;
    }

    public void setBeslutsutfall(Beslutsutfall beslutsutfall) {
        this.beslutsutfall = beslutsutfall;
    }

    public String getAvslagninsanledning() {
        return avslagninsanledning;
    }

    public void setAvslagninsanledning(String avslagninsanledning) {
        this.avslagninsanledning = avslagninsanledning;
    }

    public Kundbehov getKundbehov() {
        return kundbehov;
    }

    public void setKundbehov(Kundbehov kundbehov) {
        this.kundbehov = kundbehov;
    }
}
