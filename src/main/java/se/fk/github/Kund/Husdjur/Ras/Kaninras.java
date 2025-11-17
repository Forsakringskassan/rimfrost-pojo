package se.fk.github.Kund.Husdjur.Ras;

import se.fk.github.Kund.Husdjur.Djurtyp;

public enum Kaninras implements Ras{
    VADUR("Vädur"),
    ALASKA("Alaska"),
    ANGORA("Angora"),
    HERMELINKANIN("Hermelinkanin"),
    THRIANTA("Thrianta"),
    VIENNA("Vienna");

    private final String name;

    Kaninras(String name){
        this.name = name;
    }

    @Override
    public Djurtyp getDjurtyp() {
        return Djurtyp.KANIN;
    }

    @Override
    public String getNamn() {
        return name;
    }
}
