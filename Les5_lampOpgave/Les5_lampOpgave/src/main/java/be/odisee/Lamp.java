package be.odisee;

/**
 * Stelt een eenvoudige lamp voor met een aan/uit status.
 */
public class Lamp {

    private boolean aan;

    /**
     * Maakt een nieuwe lamp die standaard uitstaat.
     */
    public Lamp() {
        this.aan = false;
    }

    /**
     * Zet de lamp aan.
     */
    public void zetAan() {
        this.aan = true;
    }

    /**
     * Zet de lamp uit.
     */
    public void zetUit() {
        this.aan = false;
    }

    /**
     * Wisselt de status van de lamp.
     */
    public void wissel() {
        this.aan = !this.aan;
    }

    /**
     * Geeft de huidige status van de lamp terug.
     * @return true als aan, false als uit
     */
    public boolean isAan() {
        return aan;
    }
}