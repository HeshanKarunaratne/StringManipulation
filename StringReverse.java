package DataStructuresMoshHamedani.StringManipulation;

public class StringReverse {

    public static void main(String[] args) {
        String word = "heshan";
        System.out.println(reverse(word));
        System.out.println(reverse2(word));

    }

    private static String reverse(String word) {
        if (null == word)
            return "";

        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    private static String reverse2(String word) {
        if (null == word)
            return "";

        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = chars.length - 1; i >= 0; i--)
            sb.append(word.charAt(i));

        return sb.toString();
    }

}
