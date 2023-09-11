package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1046 {

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        int a = Integer.MIN_VALUE;
        for (int stone : stones) {

            list.add(stone);

        }
        list.sort(Comparator.reverseOrder());
        while (list.size() > 1) {
            if (list.get(0) != list.get(1)) {
                a = list.get(0) - list.get(1);
                list.add(a);
                list.remove(0);
                list.remove(0);
                list.sort(Comparator.reverseOrder());
            } else {
                list.remove(0);
                list.remove(0);
            }
        }
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return 0;
        }


    }
}
