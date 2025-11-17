package se.fk.github.Abstrakt;

public class Aktivitet {
    private String namn;
    private String beskrivning;

    public Aktivitet(String namn, String beskrivning)
    {
        this.namn = namn;
        this.beskrivning = beskrivning;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }
}
