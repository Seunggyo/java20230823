package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution771Test {

    @Test
    void numJewelsInStones() {
        Solution771 o1 = new Solution771();
        int i = o1.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, i);

        int j = o1.numJewelsInStones("z", "ZZ");
        assertEquals(0, j);
    }
}