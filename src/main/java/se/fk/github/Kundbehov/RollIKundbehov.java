package se.fk.github.Kundbehov;

import java.util.UUID;

public class RollIKundbehov {
    private UUID individId;
    private UUID id;
    private Roll roll;
    private String yrkande;

    public RollIKundbehov(UUID individId, UUID id, Roll roll, String yrkande)
    {
        this.individId = individId;
        this.id = id;
        this.roll = roll;
        this.yrkande = yrkande;
    }

    public UUID getIndividId() {
        return individId;
    }

    public UUID getId() {
        return id;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }

    public String getYrkande() {
        return yrkande;
    }

    public void setYrkande(String yrkande) {
        this.yrkande = yrkande;
    }
}
