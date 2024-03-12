import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // you may wish to write some code in this main method
        // to test your method.
    isPalindrome("Bob");
    isPalindrome("Cat");


    }

    public static void isPalindrome(String Word) {
    int StringLength = Word.length();
    String reversedWord = "";
    String lowercaseWord = Word.toLowerCase();

    for (int i = 0; i < StringLength; ++i) {
        reversedWord = reversedWord + lowercaseWord.charAt(StringLength - 1 - i);
    }
        if (reversedWord.equals(lowercaseWord)) {
            System.out.printf("%s is indeed a palindrome.\n", Word);
        } else if (!(reversedWord.equals(lowercaseWord))){
            System.out.printf("%s is not a palindrome.\n", Word);
        }

    }

}
