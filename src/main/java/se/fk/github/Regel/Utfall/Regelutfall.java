package se.fk.github.Regel.Utfall;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

public class Regelutfall {
    private Utfallstyper typ;
    private String varde;

    public Regelutfall(Utfallstyper typ, String varde)
    {
        this.typ = typ;
        this.varde = varde;
    }

    public void setTyp(Utfallstyper typ) {
        this.typ = typ;
    }

    public void setVarde(String varde)
    {
        this.varde = varde;
    }

    public boolean asBoolean(){
        if(typ != Utfallstyper.BOOLEAN)
        {
            throw new IllegalStateException("Kan inte läsa boolean när typ är " + typ);
        }
        return Boolean.parseBoolean(varde);
    }

    public List<String> asList(){
        if(typ != Utfallstyper.LISTA)
        {
            throw new IllegalStateException("Kan inte läsa lista när typ är " + typ);
        }
    return Arrays.stream(varde.split(","))
            .map(String::trim)
            .toList();
    }

    public int asInteger()
    {
        if(typ != Utfallstyper.HELTAL)
        {
            throw new IllegalStateException("Kan inte läsa heltal när typ är " + typ);
        }
        return Integer.parseInt(varde);
    }

    public double asDouble()
    {
        if(typ != Utfallstyper.BRAKTAL)
        {
            throw new IllegalStateException("Kan inte läsa bråktal när typ är " + typ);
        }
        return Double.parseDouble(varde);
    }

    public String asString()
    {
        if(typ != Utfallstyper.STRANG)
        {
            throw new IllegalStateException("Kan inte läsa sträng när typ är " + typ);
        }
        return varde;
    }

    public OffsetDateTime asOffsetDateTime()
    {
        if(typ != Utfallstyper.DATUM)
        {
            throw new IllegalStateException("Kan inte läsa datum när typ är " + typ);
        }
        return OffsetDateTime.parse(varde);
    }
}
