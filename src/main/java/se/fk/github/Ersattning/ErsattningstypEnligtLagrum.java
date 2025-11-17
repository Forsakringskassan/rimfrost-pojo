package se.fk.github.Ersattning;

public class ErsattningstypEnligtLagrum {
    private Ersattningstyp ersattningstyp;
    private String lagrumId;

    public ErsattningstypEnligtLagrum(Ersattningstyp ersattningstyp, String lagrumId)
    {
        this.ersattningstyp = ersattningstyp;
        this.lagrumId = lagrumId;
    }

    public Ersattningstyp getErsattningstyp() {
        return ersattningstyp;
    }

    public void setErsattningstyp(Ersattningstyp ersattningstyp) {
        this.ersattningstyp = ersattningstyp;
    }

    public String getLagrumId() {
        return lagrumId;
    }

    public void setLagrumId(String lagrumId) {
        this.lagrumId = lagrumId;
    }
}
