package se.fk.github.Uppgift;

import lombok.*;
import se.fk.github.Uppgiftsdata.Uppgiftsdata;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Uppgift extends Basuppgift{
    public OffsetDateTime planeradTillTS;
    public OffsetDateTime utfordTS;
    public Uppgiftsstatus uppgiftsstatus;
    public String aktivitet;
    public FSSAInformation fssaInformation;
    public Uppgiftsdata[] underlag;
    public Uppgiftsdata[] resultat;

    @Builder
    public Uppgift(UUID id, String version, OffsetDateTime skapadTS, String utforarId, OffsetDateTime planeradTillTS, Uppgiftsstatus uppgiftsstatus,
                   String aktivitet, FSSAInformation fssaInformation, Uppgiftsdata[] underlag, Uppgiftsdata[] resultat)
    {
        super(id, version, skapadTS, utforarId);
        this.planeradTillTS = planeradTillTS;
        this.uppgiftsstatus = uppgiftsstatus;
        this.aktivitet = aktivitet;
        this.fssaInformation = fssaInformation;
        this.underlag = underlag;
        this.resultat = resultat;
    }
}
