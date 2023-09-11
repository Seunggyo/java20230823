package test;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> fr = List.of(1);
        List<Integer> prevRow = fr;
        for (int j = 1; j < numRows; j++) {

            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for (int i = 0; i < prevRow.size() - 1; i++) {
                nextRow.add(prevRow.get(i) + prevRow.get(i + 1));
            }

            nextRow.add(1);

            t.add(nextRow);
            prevRow = nextRow;

        }
        return t;
    }

}
