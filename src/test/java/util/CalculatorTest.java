package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAddTwoNumbersTogether() throws Exception {
        assertEquals("The answer is 42", calculator.addNumbers("40", "2"));
    }

    @Test
    public void canSubtractTwoNumbersFromEachOther() throws Exception {
        assertEquals("The answer is 13", calculator.subtractNumbers("19", "6"));
    }

    @Test
    public void canMultiplyTwoNumbersTogether() throws Exception {
        assertEquals("The answer is 9", calculator.multiplyNumbers("3", "3"));
    }

    @Test
    public void canDivideTwoNumbersTogether() throws Exception {
        assertEquals("The answer is 9", calculator.divideNumbers("27", "3"));
    }

    @Test
    public void canIdentifyWhenAddOperatorHasBeenSelected() throws Exception {
        assertEquals("The answer is 9", calculator.operatorSelector("+", "4", "5"));
    }

    @Test
    public void canIdentifyWhenSubtractOperatorHasBeenSelected() throws Exception {
        assertEquals("The answer is 25", calculator.operatorSelector("-", "30", "5"));
    }

    @Test
    public void canIdentifyWhenMultiplyOperatorHasBeenSelected() throws Exception {
        assertEquals("The answer is 42", calculator.operatorSelector("*", "6", "7"));
    }

    @Test
    public void canIdentifyWhenDivideOperatorHasBeenSelected() throws Exception {
        assertEquals("The answer is 7", calculator.operatorSelector("/", "49", "7"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canIdentifyWhenAnInvalidOperatorHasBeenSelected() throws Exception {
        assertEquals("Invalid argument exception", calculator.operatorSelector("ggg", "49", "7"));
    }

    @Test
    public void canAlsoFindTheRemainderOfANumberWhenDivideOperatorIsUsed() throws Exception {
        assertEquals("The answer is 5 and the remainder is 2", calculator.operatorSelector("/", "27", "5"));
    }
}
