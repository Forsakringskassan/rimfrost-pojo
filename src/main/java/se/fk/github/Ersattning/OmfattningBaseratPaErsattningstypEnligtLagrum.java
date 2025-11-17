package se.fk.github.Ersattning;

public class OmfattningBaseratPaErsattningstypEnligtLagrum {
    private int procentAvErsattning;
    private ErsattningstypEnligtLagrum ersattningstypEnligtLagrum;

    public OmfattningBaseratPaErsattningstypEnligtLagrum(int procentAvErsattning, ErsattningstypEnligtLagrum ersattningstypEnligtLagrum)
    {
        this.procentAvErsattning = procentAvErsattning;
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }

    public int getProcentAvErsattning() {
        return procentAvErsattning;
    }

    public void setProcentAvErsattning(int procentAvErsattning) {
        this.procentAvErsattning = procentAvErsattning;
    }

    public ErsattningstypEnligtLagrum getErsattningstypEnligtLagrum() {
        return ersattningstypEnligtLagrum;
    }

    public void setErsattningstypEnligtLagrum(ErsattningstypEnligtLagrum ersattningstypEnligtLagrum) {
        this.ersattningstypEnligtLagrum = ersattningstypEnligtLagrum;
    }
}
