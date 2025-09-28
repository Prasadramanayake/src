package LW02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringTokenizer st =new StringTokenizer(sentence);


        StringBuilder cleaned = new StringBuilder();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            word = word.replaceAll("[^a-zA-Z]", "");

            word = word.toLowerCase();

            cleaned.append(word);
        }

        String original = cleaned.toString();

        String reversed = new StringBuilder(original).reverse().toString();


        if (original.equals(reversed)) {
            System.out.println(" The sentence is a palindrome.");
        } else {
            System.out.println(" The sentence is not a palindrome.");
        }
    }
}
