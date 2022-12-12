package DataStructuresMoshHamedani.StringManipulation;


import java.util.Arrays;
import java.util.Collections;

public class ReverseSentence {

    public static void main(String[] args) {

        String word = " se is everything ";

        System.out.println("'" + reverseSentence(word) + "'");

    }

    /**
     *
     * @param word
     * @return
     */
    private static String reverseSentence(String word) {
        if (null == word) return "";

        String[] value = word.trim().split(" ");
        Collections.reverse(Arrays.asList(value));
        return String.join(" " , value);

    }
}
