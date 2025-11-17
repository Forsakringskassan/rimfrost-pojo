package se.fk.github.Kund;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import se.fk.github.Kundbehov.RollIKundbehov;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class FysiskPerson extends Individ{
    public String personnummer;
    public String fornamn;
    public String efternamn;
    public Kon kon;
    public RollIKundbehov rollIKundbehov;

    public FysiskPerson(UUID id, String version, RollIKundbehov rollIKundbehov, String personnummer, String fornamn, String efternamn, Kon kon)
    {
        super(id, version, rollIKundbehov);
        this.personnummer = personnummer;
        this.fornamn = fornamn;
        this.efternamn = efternamn;
        this.kon = kon;
    }
}
