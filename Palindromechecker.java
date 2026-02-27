import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     DEQUE BASED PALINDROME CHECK     ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        Deque<Character> deque = new ArrayDeque<>();

        
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        
        while (deque.size() > 1) {

            char front = deque.removeFirst();  
            char rear = deque.removeLast();   

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

       
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended Successfully.");

        scanner.close();
    }
}
