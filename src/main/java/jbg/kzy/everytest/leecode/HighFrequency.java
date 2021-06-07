package jbg.kzy.everytest.leecode;

import java.util.*;

/**
 * High Frequency
 *
 * @author ckh
 * @since 2021/5/26.
 */
public class HighFrequency {
    public static List<String> topKFrequency(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                ((o1, o2) -> o1.getValue().equals(o2.getValue()) ?
                        o1.getKey().compareTo(o2.getKey()) :
                        o1.getValue() - o2.getValue()));
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        String[] a = {"a","b","c","d","e","f","a","f","b","k","j"};
        List<String> r = topKFrequency(a, 3);
        for (String s : r) {
            System.out.println(s);
        }
    }
}
