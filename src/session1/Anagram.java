package session1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 ");
        String word1 = sc.nextLine();
        String word1L = word1.toLowerCase();
        System.out.println("Enter String 2 ");
        String word2 = sc.nextLine();
        String word2L = word2.toLowerCase();
        char[] ch1 = word1L.toCharArray();
        char[] ch2 = word2L.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        String result1 = String.valueOf(ch1);
        String result2 = String.valueOf(ch2);
        if (result1.equals(result2)) {
            System.out.println("Yes Aanagram");
        } else {
            System.out.println("Not a Anagram");
        }
        sc.close();

    }

}
