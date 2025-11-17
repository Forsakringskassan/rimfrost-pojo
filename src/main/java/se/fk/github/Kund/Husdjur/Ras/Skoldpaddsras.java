package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Skoldpaddsras implements Ras{
    ORMHALSSKOLDPADDA("Ormhalssköldpadda"),
    PELOMEDUSASKOLDPADDA("Pelomedusasköldpadda"),
    LANDSKOLDPADDA("Landsköldpadda"),
    HUGGSKOLDPADDA("Huggsköldpadda");

    private final String namn;

    Skoldpaddsras(String namn) {
        this.namn = namn;
    }

    @Override
    public Djurtyp getDjurtyp() {
        return Djurtyp.SKOLDPADDA;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
