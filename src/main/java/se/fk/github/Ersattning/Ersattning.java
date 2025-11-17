package se.fk.github.Ersattning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import se.fk.github.Beslut.Beslutsutfall;
import se.fk.github.Kund.Individ;
import se.fk.github.Uppgift.Uppgiftsstatus;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Ersattning extends ProduceratResultat{
    public double belopp;
    public ErsattningstypEnligtLagrum  ersattningstyp;
    public BerakningsgrundBaseratPaErsattningstypEnligtLagrum berakningsgrund;
    public BeloppstypBaseratPaErsattningstypEnligtLagrum beloppstyp;
    public Periodisering periodisering;
    public OmfattningBaseratPaErsattningstypEnligtLagrum omfattning;
    public Beslutsutfall beslutsutfall;
    public String avslagninsanledning;

    public Ersattning(UUID id, String version, OffsetDateTime from, OffsetDateTime tom, Uppgiftsstatus status, Individ individ, double belopp, ErsattningstypEnligtLagrum ersattningstyp, BerakningsgrundBaseratPaErsattningstypEnligtLagrum berakningsgrund,
                      BeloppstypBaseratPaErsattningstypEnligtLagrum beloppstyp, Periodisering periodisering, OmfattningBaseratPaErsattningstypEnligtLagrum omfattning,
                      Beslutsutfall beslutsutfall)
    {
        super(id, version, from, tom, status, individ);
        this.belopp = belopp;
        this.ersattningstyp = ersattningstyp;
        this.berakningsgrund = berakningsgrund;
        this.beloppstyp = beloppstyp;
        this.periodisering = periodisering;
        this.omfattning = omfattning;
        this.beslutsutfall = beslutsutfall;
    }
}
