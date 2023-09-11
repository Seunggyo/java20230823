package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            int oldValue = map.get(num);
            map.put(num, oldValue + 1);
        }
        int sum = 0;
        for (Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() > 1) {
                int midSum = entrySet.getValue() * (entrySet.getValue() - 1) / 2;
                sum += midSum;
            }
        }
        return sum;
    }
}

