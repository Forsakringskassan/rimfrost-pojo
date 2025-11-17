package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Kattras implements Ras {
    BONDKATT("Bondkatt"),
    SPHINX("Sphinx"),
    RAGDOLL("Ragdoll"),
    MAINE_COON("Maine coon"),
    RUSSIAN_BLUE("Russian blue"),
    BRITTISH_SHORTHAIR("Brittish shorthair"),
    NORSK_SKOGSKATT("Norsk skogskatt");

    private final String namn;

    Kattras(String namn)
    {
        this.namn = namn;
    }

    @Override
    public Djurtyp getDjurtyp() {
        return Djurtyp.KATT;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
