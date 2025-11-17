package se.fk.github.Kund;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.fk.github.Kundbehov.RollIKundbehov;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Individ {
    public UUID id;
    public String version;
    public RollIKundbehov rollIKundbehov;
}
