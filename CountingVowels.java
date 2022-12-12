package DataStructuresMoshHamedani.StringManipulation;

public class CountingVowels {

    public static void main(String[] args) {
        String input = "heshAAan";
        System.out.println(countVowels(input));
    }

    private static int countVowels(String input) {

        int count = 0;
        String vowels = "aeiou";
        for (char i: input.toLowerCase().toCharArray()) {
            if(vowels.indexOf(i) != -1)
                count++;
        }
        return count;
    }
}
