import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static boolean iterativeCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return recursiveCheck(str, start + 1, end - 1);
    }

    public static boolean stackCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
            stack.push(str.charAt(i));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long start1 = System.nanoTime();
        boolean result1 = iterativeCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = recursiveCheck(normalized, 0, normalized.length() - 1);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = stackCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Iterative Result: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Recursive Result: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Result: " + result3 + " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}
