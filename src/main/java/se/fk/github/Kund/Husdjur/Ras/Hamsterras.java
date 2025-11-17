package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Hamsterras implements Ras{
    GULDHAMSTER("Guldhamster"),
    DVARGVINTERHAMSTER("Dvärgvinterhamster"),
    ROBOROVSKI_DVARGHAMSTER("Roborovski dvärghamster"),
    KINESISK_DVARGHAMSTER("Kinesiskt dvärghamster");

    private final String namn;

    Hamsterras(String namn) {
        this.namn = namn;
    }

    @Override
    public Djurtyp getDjurtyp() {
        return Djurtyp.HAMSTER;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
