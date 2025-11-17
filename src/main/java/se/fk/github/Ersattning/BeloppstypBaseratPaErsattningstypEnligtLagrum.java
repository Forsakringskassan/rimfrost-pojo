package se.fk.github.Ersattning;

public class BeloppstypBaseratPaErsattningstypEnligtLagrum {
    private Beloppstyp beloppstyp;
    private ErsattningstypEnligtLagrum ersattningstypEnligtLagrum;

    public BeloppstypBaseratPaErsattningstypEnligtLagrum(Beloppstyp beloppstyp, ErsattningstypEnligtLagrum ersattningstypEnligtLagrum)
    {
        this.beloppstyp = beloppstyp;
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }

    public Beloppstyp getBeloppstyp() {
        return beloppstyp;
    }

    public void setBeloppstyp(Beloppstyp beloppstyp) {
        this.beloppstyp = beloppstyp;
    }

    public ErsattningstypEnligtLagrum getErsattningstypEnligtLagrum() {
        return ersattningstypEnligtLagrum;
    }

    public void setErsattningstypEnligtLagrum(ErsattningstypEnligtLagrum ersattningstypEnligtLagrum) {
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }
}
