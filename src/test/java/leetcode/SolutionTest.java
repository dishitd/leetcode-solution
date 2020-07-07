package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    public void test1342GetNumberOfStepsToZero() {
        assertEquals(6, solution.numberOfSteps(14));
        assertEquals(4, solution.numberOfSteps(8));
        assertEquals(1, solution.numberOfSteps(1));
        assertEquals(0, solution.numberOfSteps(0));

    }

    @Test
    public void test771GetJewelsFromStones() {
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
        assertEquals(2, solution.numJewelsInStones("dbca", "beb"));
        assertEquals(3, solution.numJewelsInStones("dbca", "bba"));
    }

    @Test
    public void test760GetAnagramLocations() {
        int[] A = {12, 28, 46, 32, 50};
        int [] B = {50, 12, 32, 46, 28};
        int [] expected = {1, 4, 3, 2, 0};
        assertArrayEquals(expected, solution.anagramMappings(A, B));
    }



}