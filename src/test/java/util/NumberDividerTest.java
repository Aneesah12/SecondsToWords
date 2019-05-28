package util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberDividerTest {
    NumberDivider numberDivider = new NumberDivider();

    @Test
    public void canCorrectlyIdentifyThatANumberIsDivisibleByFive() {
        assertEquals("number is divisible by five", numberDivider.numberIsDivisibleByFive(10));
    }

    @Test
    public void canCorrectlyIdentifyThatANumberIsNotDivisibleByFive() {
        assertEquals("number is not divisible by five", numberDivider.numberIsDivisibleByFive(9));
    }

    @Test
    public void canCorrectlyIdentifyThatAGivenNumberIsDivisibleByGivenDenominator() throws Exception {
        assertEquals("16 is divisible by 4", numberDivider.numberIsDivisibleByDenominator(16, 4));
    }

    @Test
    public void canCorrectlyIdentifyThatAGivenNumberIsNotDivisibleByGivenDenominator() throws Exception {
        assertEquals("16 is not divisible by 5", numberDivider.numberIsDivisibleByDenominator(16, 5));
    }

    @Test
    public void canCorrectlyIdentifyHowManyTimesANumberIsDivisibleByItsDenominator() throws Exception {
        assertEquals("36 divided by 12 is 3", numberDivider.numberDivider(36, 12));
    }

    @Test
    public void canCorrectlyIdentifyHowManyTimesANumberIsDivisibleByItsDenominatorAndFindItsRemainder() throws Exception {
        assertEquals("39 divided by 8 is 4 with remainder 7", numberDivider.numberDivider(39, 8));
    }

}
