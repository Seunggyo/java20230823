package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution1748Test {

    @Test
    void sumOfUnique() {
        Solution1748 o1 = new Solution1748();
        int i = o1.sumOfUnique(new int[]{1, 2, 3, 2});
        assertEquals(4, i);
        int i1 = o1.sumOfUnique(new int[]{1, 1, 1, 1, 1});
        assertEquals(0, i1);
        int i2 = o1.sumOfUnique(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, i2);
    }
}