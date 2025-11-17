package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Hundras implements Ras{
    NORRBOTTENSPETS("Norrbottenspets"),
    FINSK_SPETS("Finsk spets"),
    JAMTHUND("Jämthund"),
    GRAHUND("Gråhund"),
    HAMILTONSTOVARE("Hamiltonstövare"),
    FINNSTOVARE("Finnstövare"),
    LABRADOR("Labrador");

    private final String namn;

    Hundras(String namn)
    {
        this.namn = namn;
    }

    @Override
    public Djurtyp getDjurtyp()
    {
        return Djurtyp.HUND;
    }

    @Override
    public String getNamn() { return namn; }
}
