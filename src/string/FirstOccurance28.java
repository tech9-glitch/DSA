package string;

import java.util.Scanner;

public class FirstOccurance28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        int result = StrStr(haystack, needle);

        System.out.println("First Occurrence Index: " + result);

        sc.close();
    }

    static int StrStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}



////class Solution {
//public int strStr(String haystack, String needle) {
//    return haystack.indexOf(needle);
//}
//}