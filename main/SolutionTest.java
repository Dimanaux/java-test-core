package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSum() {
        assertTrue(Solution.sum(3, 4) == 7);
        assertTrue(Solution.sum(2, 2) == 4);
    }
}

