package se.fk.github.Kund.Husdjur;

import se.fk.github.Kund.FysiskPerson;
import se.fk.github.Kund.Husdjur.Ras.Ras;
import se.fk.github.Kund.Individ;
import se.fk.github.Kund.Kon;

import java.util.UUID;

public class Husdjur extends Individ{
    private FysiskPerson agare;
    private String regNr;
    private String chipNr;
    private final Djurtyp djurtyp;
    private Ras ras;
    private final String namn;
    private final Kon kon;

    public Husdjur(UUID id, String version, FysiskPerson agare, String regNr, String chipNr, Djurtyp djurtyp, Ras ras, String namn, Kon kon)
    {
        super(id, version);
        this.agare = agare;
        this.regNr = regNr;
        this.chipNr = chipNr;
        this.djurtyp = djurtyp;
        this.setRas(ras);
        this.namn = namn;
        this.kon = kon;
    }

    public void setRas(Ras ras)
    {
        if (ras != null && djurtyp != null && ras.getDjurtyp() != djurtyp)
        {
            throw new IllegalArgumentException("Ras" + ras + "hör till " + ras.getDjurtyp() + ", inte " + djurtyp);
        }
        this.ras = ras;
    }

    public FysiskPerson getAgare() {
        return agare;
    }

    public void setAgare(FysiskPerson agare) {
        this.agare = agare;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getChipNr() {
        return chipNr;
    }

    public void setChipNr(String chipNr) {
        this.chipNr = chipNr;
    }

    public Ras getRas() {
        return ras;
    }

    public String getNamn() {
        return namn;
    }

    public Kon getKon() {
        return kon;
    }
}
