package se.fk.github.Beslut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.fk.github.Lag.Lagrum;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Beslut {
    public UUID id;
    public String version;
    public OffsetDateTime beslutsdatum;
    public String beslutsfattareId;
    public BeslutandeOrganisation beslutsfattandeOrganisation;
    public BeslutEnligtLagrum beslutEnligtLagrum;
}
