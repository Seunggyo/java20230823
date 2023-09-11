package test;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int a = 0;
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        for (String w : words) {
            int i = 0;
            for (char d : w.toCharArray()) {
                if (!set.contains(d)) {
                    break;
                }
                i++;
            }
            if (i == w.length()) {
                a++;
            }
        }
        return a;
    }
}
