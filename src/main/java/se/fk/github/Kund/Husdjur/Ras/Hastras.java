package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Hastras implements Ras{
    ARABIAN("Arabian"),
    ABSTANG("Abstang"),
    DJERMA("Djerma"),
    FURIOSO("Furioso"),
    MUSTANG("Mustang");

    private final String namn;

    Hastras(String namn)
    {
        this.namn = namn;
    }

    @Override
    public Djurtyp getDjurtyp() {
        return Djurtyp.HAST;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
