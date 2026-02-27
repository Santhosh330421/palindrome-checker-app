public class UseCase2PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     HARDCODED PALINDROME CHECKER     ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

       
        String word = "madam";

        System.out.println("Hardcoded String : " + word);

        
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        
        if (word.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended Successfully.");
    }
}
