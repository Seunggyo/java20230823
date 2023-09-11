package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution287Test {

    @Test
    void findDuplicate() {
        Solution287 o1 = new Solution287();
        int num1 = o1.findDuplicate(new int[]{1, 2, 4, 2, 2});
        assertEquals(2, num1);

        int num2 = o1.findDuplicate(new int[]{3, 1, 3, 4, 2});
        assertEquals(3, num2);
    }
}