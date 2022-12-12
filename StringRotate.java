package DataStructuresMoshHamedani.StringManipulation;

public class StringRotate {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "REWW";

        System.out.println(rotate(str1, str2));
    }

//        ABCD -> BCDA
//                CDAB
//                DABC
//                ABCD

    private static boolean rotate(String str1, String str2) {
        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }
}
