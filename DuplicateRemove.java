package DataStructuresMoshHamedani.StringManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {

    public static void main(String[] args) {

        String word = "   rsgsrg ";
        System.out.println("'" + removeDuplicates(word) + "'");
    }

    /**
     * Removes duplicates for a given string
     * @param word
     * @return
     */
    private static String removeDuplicates(String word) {
        if (word == null) return "";

        Set<String> set = new LinkedHashSet<>();
        for (char x : word.trim().toCharArray()) {
            if (!set.contains(x))
                set.add(String.valueOf(x));

        }
        return  String.join("", set);
    }
}
