package se.fk.github.Kund.Anstallning;

import se.fk.github.Kund.FysiskPerson;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Anstallning {
    public UUID id;
    public String version;
    public int arbetstid;
    public OffsetDateTime anstallningsdag;
    public OffsetDateTime sista_anstallningsdag;
    public FysiskPerson fysiskPerson;

    public Anstallning(UUID id, String version, int arbetstid, OffsetDateTime anstallningsdag, FysiskPerson fysiskPerson)
    {
        this.id = id;
        this.version = version;
        this.arbetstid = arbetstid;
        this.anstallningsdag = anstallningsdag;
        this.fysiskPerson = fysiskPerson;
    }
}
