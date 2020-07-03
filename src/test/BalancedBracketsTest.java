package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void initTest() {
        assertEquals(true, main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertEquals(true, main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue() {
        assertEquals(true, main.BalancedBrackets.hasBalancedBrackets("[String]"));
    }

    @Test
    public void nestedReturnsTrue() {
        assertEquals(true, main.BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyLeftBracketsReturnsFalse() {
        assertEquals(false, main.BalancedBrackets.hasBalancedBrackets("["));
    }

    //@Test
    //public void wrongOrderBracketsReturnsFalse() {
    //    assertEquals(false, main.BalancedBrackets.hasBalancedBrackets("]["));
    //}

    @Test
    public void otherMismatchReturnsFalse() {
        assertEquals(false, main.BalancedBrackets.hasBalancedBrackets("[[]"));
    }

}
