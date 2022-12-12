package DataStructuresMoshHamedani.StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {

    public static void main(String[] args) {
        String word = "ddaa";
        System.out.println(mostRepeatedCharacter2(word));
    }

    private static char mostRepeatedCharacter(String word) {
        if (word == null || word.isEmpty()) throw new IllegalArgumentException();

        int max = 0;
        char out = ' ';

        Map<Character, Integer> map = new HashMap<>();

        for (char x : word.trim().toCharArray()) {
            if (!map.containsKey(x))
                map.put(x, 1);
            else
                map.put(x, map.getOrDefault(x, 1) + 1);

        }

        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            if (val.getValue() > max) {
                max = val.getValue();
                out = val.getKey();
            }
        }
        System.out.println(map);
        return out;
    }

    private static char mostRepeatedCharacter2(String word) {
        if (word == null || word.isEmpty()) throw new IllegalArgumentException();

        int max = 0;
        char out = ' ';

        final int ASCII_VALUE = 265;
        int[] frequencies = new int[ASCII_VALUE];
        for (char ch : word.trim().toCharArray()) {
            frequencies[ch]++;

        }

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                out = (char) i;
            }
        }
        return out;
    }
}
