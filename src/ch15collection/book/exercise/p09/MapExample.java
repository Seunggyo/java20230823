package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> map1 : entrySet) {
            if (map1.getValue() > maxScore) {
                name = map1.getKey();
                maxScore = map1.getValue();
            }
            totalScore += map1.getValue();


        }
        double avgScore = totalScore / (double) map.size();
        System.out.println("평균 점수 : " + avgScore);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최고점수 아이디 : " + name);

    }

}
