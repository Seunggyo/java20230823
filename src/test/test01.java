package test;

import java.util.ArrayList;
import java.util.List;

public class test01 {


}

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            maxx = Math.max(candies[i], maxx);
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= maxx) {
                l.add(true);
            } else {
                l.add(false);
            }
        }
        return l;
    }

}