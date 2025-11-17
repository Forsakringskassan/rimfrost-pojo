package se.fk.github.Ersattning;

public class BerakningsgrundBaseratPaErsattningstypEnligtLagrum {
    private Berakningsgrund berakningsgrund;
    private ErsattningstypEnligtLagrum ersattningstypEnligtLagrum;

    public BerakningsgrundBaseratPaErsattningstypEnligtLagrum(Berakningsgrund berakningsgrund, ErsattningstypEnligtLagrum ersattningstypEnligtLagrum)
    {
        this.berakningsgrund = berakningsgrund;
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }

    public Berakningsgrund getBerakningsgrund() {
        return berakningsgrund;
    }

    public void setBerakningsgrund(Berakningsgrund berakningsgrund) {
        this.berakningsgrund = berakningsgrund;
    }

    public ErsattningstypEnligtLagrum getErsattningstypEnligtLagrum() {
        return ersattningstypEnligtLagrum;
    }

    public void setErsattningstypEnligtLagrum(ErsattningstypEnligtLagrum ersattningstypEnligtLagrum) {
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }
}
