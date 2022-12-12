package DataStructuresMoshHamedani.StringManipulation;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String word1 = "ABCD";
        String word2 = "BeCD";

        System.out.println(anagrams(word1, word2));
        System.out.println(anagrams2(word1, word2));
    }

    private static boolean anagrams(String word1, String word2) {

        if ((word1 == null || word2 == null) || word1.length() != word2.length()) return false;

        char[] chars1 = word1.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }

    private static boolean anagrams2(String word1, String word2) {

        final int ALPHABET_WORDS = 26;
        int [] frequencies = new int[ALPHABET_WORDS];

        if ((word1 == null || word2 == null) || word1.length() != word2.length()) return false;

        word1 = word1.toLowerCase();
        for (int i = 0; i < word1.length(); i++) {
            frequencies[word1.charAt(i) - 'a']++;
        }

        word2 = word2.toLowerCase();
        for (int i = 0; i < word2.length(); i++) {
            int index = word2.charAt(i) - 'a';
            if(frequencies[index] == 0)
                return false;

            frequencies[index]--;
        }
        return true;
    }
}
