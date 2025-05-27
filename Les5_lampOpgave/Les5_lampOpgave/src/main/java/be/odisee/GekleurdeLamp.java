package be.odisee;

/**
 * Stelt een gekleurde lamp voor, afgeleid van de basislamp.
 */
public class GekleurdeLamp extends Lamp {

    private String kleur;

    /**
     * Maakt een nieuwe gekleurde lamp met een gegeven kleur.
     * @param kleur de initiële kleur
     */
    public GekleurdeLamp(String kleur) {
        super();
        this.kleur = kleur;
    }

    /**
     * Geeft de kleur van de lamp terug.
     * @return de kleur
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * Wijzigt de kleur van de lamp.
     * @param kleur de nieuwe kleur
     */
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}