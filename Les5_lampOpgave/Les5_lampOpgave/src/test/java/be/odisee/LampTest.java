package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests voor de lampenhiërarchie.
 */
public class LampTest {

    private Lamp lamp;
    private GekleurdeLamp gekleurdeLamp;

    @BeforeEach
    void setUp() {
        lamp = new Lamp();
        gekleurdeLamp = new GekleurdeLamp("Rood");
    }

    @Test
    void testLamp() {
        assertFalse(lamp.isAan());
        lamp.zetAan();
        assertTrue(lamp.isAan());
        lamp.zetUit();
        assertFalse(lamp.isAan());
        lamp.wissel();
        assertTrue(lamp.isAan());
    }

    @Test
    void testGekleurdeLamp() {
        assertEquals("Rood", gekleurdeLamp.getKleur());
        gekleurdeLamp.setKleur("Blauw");
        assertEquals("Blauw", gekleurdeLamp.getKleur());
    }

    @Test
    void testGekleurdeLampSoorten() {
        assertAll(
                () -> {
                    LEDLamp led = new LEDLamp("Groen");
                    assertEquals("Groen", led.getKleur());
                    assertFalse(led.isAan());
                },
                () -> {
                    HalogeenLamp halogeen = new HalogeenLamp("Geel");
                    assertEquals("Geel", halogeen.getKleur());
                    assertFalse(halogeen.isAan());
                }
        );
    }
}