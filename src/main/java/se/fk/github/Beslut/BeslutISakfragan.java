package se.fk.github.Beslut;

import lombok.*;
import se.fk.github.Kundbehov.Kundbehov;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class BeslutISakfragan extends Beslut{
    public Beslutstyper beslutstyp;
    public Beslutsutfall beslutsutfall;
    public String avslagsanledning;
    public Kundbehov kundbehov;

    @Builder
    public BeslutISakfragan(UUID id, String version, OffsetDateTime beslutsdatum, String beslutsfattareId, BeslutandeOrganisation beslutandeOrganisation,
                            BeslutEnligtLagrum beslutEnligtLagrum, Beslutstyper beslutstyp, Beslutsutfall beslutsutfall, String avslagsanledning, Kundbehov kundbehov)
    {
        super(id, version, beslutsdatum, beslutsfattareId, beslutandeOrganisation, beslutEnligtLagrum);
        this.beslutstyp = beslutstyp;
        this.beslutsutfall = beslutsutfall;
        this.avslagsanledning = avslagsanledning;
        this.kundbehov = kundbehov;
    }
}
