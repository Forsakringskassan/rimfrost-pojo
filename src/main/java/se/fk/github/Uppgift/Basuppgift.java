package se.fk.github.Uppgift;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Basuppgift {
    public UUID id;
    public String version;
    public OffsetDateTime skapadTS;
    public String utforarId;
}
