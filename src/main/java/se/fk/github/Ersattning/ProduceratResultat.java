package se.fk.github.Ersattning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.fk.github.Kund.Individ;
import se.fk.github.Uppgift.Uppgiftsstatus;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ProduceratResultat {
    public UUID id;
    public String version;
    public OffsetDateTime from;
    public OffsetDateTime tom;
    public Uppgiftsstatus status;
    public Individ individ;
}
