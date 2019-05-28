package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Seconds2WordsTest {

    Seconds2Words seconds2Words = new Seconds2Words();

    @Test
    public void convertZeroSeconds() {
        assertEquals("0 seconds", seconds2Words.convert(0));
    }

    @Test
    public void convertSecondsUnderOneMinute() {
        assertEquals("44 seconds", seconds2Words.convert(44));
    }

    @Test
    public void convertOneSecond() {
        assertEquals("1 second", seconds2Words.convert(1));
    }

    @Test
    public void convertPluralMinsPluralSecsFromPluralSecs() {
        assertEquals("7 minutes, 47 seconds", seconds2Words.convert(467));
    }

    @Test
    public void convertPluralMinsSingularSecsFromPluralSecs() {
        assertEquals("3 minutes, 1 second", seconds2Words.convert(181));
    }

    @Test
    public void convertSingularMinsSingularSecsFromPluralSecs() {
        assertEquals("1 minute, 1 second", seconds2Words.convert(61));
    }

    @Test
    public void convertSingularMinsPluralSecsFromPluralSecs() {
        assertEquals("1 minute, 3 seconds", seconds2Words.convert(63));
    }

    @Test
    public void convertWholeMinsFromPluralSecs() {
        assertEquals("4 minutes", seconds2Words.convert(240));
    }

    @Test
    public void convertWholeMinFromPluralSecs() {
        assertEquals("1 minute", seconds2Words.convert(60));
    }

    @Test
    public void convertPluralHoursPluralMinsPluralSecsFromPluralSecs() {
        assertEquals("3 hours, 4 minutes, 5 seconds", seconds2Words.convert(11045));
    }

    @Test
    public void convertWholeHoursFromPluralSecs() {
        assertEquals("5 hours, 0 minutes", seconds2Words.convert(18000));
    }

    @Test
    public void convertWholeHoursSingleMinsFromPluralSecs() {
        assertEquals("5 hours, 1 minute", seconds2Words.convert(18060));
    }

    @Test
    public void convertWholeHoursPluralMinsSingleSecondsFromPluralSecs() {
        assertEquals("5 hours, 2 minutes, 1 second", seconds2Words.convert(18121));
    }

    @Test
    public void convertWholeHoursSingleMinsPluralSecondsFromPluralSecs() {
        assertEquals("5 hours, 1 minute, 7 seconds", seconds2Words.convert(18067));
    }

    @Test
    public void convertWholeHoursSingleMinsSingleSecondsFromPluralSecs() {
        assertEquals("5 hours, 1 minute, 1 second", seconds2Words.convert(18061));
    }

    @Test
    public void convertWholeHourSingleMinsSingleSecondsFromPluralSecs() {
        assertEquals("1 hour, 1 minute, 1 second", seconds2Words.convert(3661));
    }
}