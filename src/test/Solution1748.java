package test;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1); //첫발견
            } else {
                int oldValue = map.get(num);
                map.put(num, oldValue + 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

}
