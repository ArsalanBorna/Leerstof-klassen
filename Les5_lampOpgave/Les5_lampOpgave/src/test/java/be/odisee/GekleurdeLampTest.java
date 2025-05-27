package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests voor GekleurdeLamp en afgeleiden.
 */
public class GekleurdeLampTest {

    private GekleurdeLamp gekleurdeLamp;

    @BeforeEach
    void setUp() {
        gekleurdeLamp = new GekleurdeLamp("Rood");
    }

    @Test
    void testInitieelUit() {
        assertFalse(gekleurdeLamp.isAan());
    }

    @Test
    void testKleurGetterSetter() {
        assertEquals("Rood", gekleurdeLamp.getKleur());
        gekleurdeLamp.setKleur("Geel");
        assertEquals("Geel", gekleurdeLamp.getKleur());
    }

    @Test
    void testAanUitWissel() {
        gekleurdeLamp.zetAan();
        assertTrue(gekleurdeLamp.isAan());

        gekleurdeLamp.zetUit();
        assertFalse(gekleurdeLamp.isAan());

        gekleurdeLamp.wissel();
        assertTrue(gekleurdeLamp.isAan());
    }

    @Test
    void testLEDLamp() {
        LEDLamp led = new LEDLamp("Blauw");
        assertEquals("Blauw", led.getKleur());
        assertFalse(led.isAan());
    }

    @Test
    void testHalogeenLamp() {
        HalogeenLamp halogeen = new HalogeenLamp("Groen");
        assertEquals("Groen", halogeen.getKleur());
        assertFalse(halogeen.isAan());
    }
}