package se.fk.github.Uppgift;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Tjansteanteckning extends Basuppgift{
    public String rubrik;
    public String anteckning;

    public Tjansteanteckning(UUID id, String version, OffsetDateTime skapadTS, String utforarId, String rubrik, String anteckning)
    {
        super(id,version,skapadTS,utforarId);
        this.rubrik=rubrik;
        this.anteckning=anteckning;
    }
}
