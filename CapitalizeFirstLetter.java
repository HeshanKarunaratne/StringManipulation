package DataStructuresMoshHamedani.StringManipulation;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {

        String word = "  trees are   beautiful!  ";
        System.out.println("'" + capitalizeFirst(word) + "'");
    }

    private static String capitalizeFirst(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return "";

        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }
}
