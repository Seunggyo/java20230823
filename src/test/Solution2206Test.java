package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution2206Test {

    @Test
    void divideArray() {
        Solution2206 o1 = new Solution2206();
        boolean b = o1.divideArray(
            new int[]{18, 19, 5, 5, 18, 19, 5, 6, 12, 19, 13, 4, 16, 11, 4, 16, 10, 8, 12, 8, 2, 1,
                8, 17, 4, 18, 3, 5, 16, 2, 16, 12, 17, 16, 7, 16, 2, 17, 19, 9, 1, 20, 17, 17, 4,
                6});
        assertEquals(true, b);

    }
}