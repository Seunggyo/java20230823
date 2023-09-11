package test;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();

        int a = 0;
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                a++;
            }
        }

        return a;
    }
}
