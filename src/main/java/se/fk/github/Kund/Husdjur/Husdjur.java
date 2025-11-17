package se.fk.github.Kund.Husdjur;

import lombok.*;
import se.fk.github.Kund.Husdjur.Ras.Ras;
import se.fk.github.Kund.Individ;
import se.fk.github.Kund.Kon;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Husdjur extends Individ{
    public String agare;
    public String regNr;
    public String chipNr;
    public Djurtyp djurtyp;
    public Ras ras;
    public String namn;
    public Kon kon;

    @Builder
    public Husdjur(UUID id, String version, String agare, String regNr, String chipNr, Djurtyp djurtyp, Ras ras, String namn, Kon kon)
    {
        super(id, version);
        this.agare = agare;
        this.regNr = regNr;
        this.chipNr = chipNr;
        this.djurtyp = djurtyp;
        this.setRas(ras);
        this.namn = namn;
        this.kon = kon;
    }

    public void setRas(Ras ras)
    {
        if (ras != null && djurtyp != null && ras.getDjurtyp() != djurtyp)
        {
            throw new IllegalArgumentException("Ras" + ras + "hör till " + ras.getDjurtyp() + ", inte " + djurtyp);
        }
        this.ras = ras;
    }
}
