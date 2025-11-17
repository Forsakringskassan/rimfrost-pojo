package se.fk.github.Kund.Folkbokforing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Folkbokforingsadress {
    public String careOf;
    public String utdelningsadress1;
    public String utdelningsadress2;
    public String postnummer;
    public String postort;
}
