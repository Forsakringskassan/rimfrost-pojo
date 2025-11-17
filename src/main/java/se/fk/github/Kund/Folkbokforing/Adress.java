package se.fk.github.Kund.Folkbokforing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Adress extends Folkbokforingsadress {
    public UUID id;
    public String version;

    public Adress(String careOf, String utdelningsadress1, String utdelningsadress2, String postnummer, String postort, UUID id, String version)
    {
        super(careOf, utdelningsadress1, utdelningsadress2, postnummer, postort);
        this.id = id;
        this.version = version;
    }
}
