package hackerranke;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;


public class StackPuzzle {

    private final static String openBracket = "(";
    private final static String closeBracket = ")";
    private final static String openSquareBracket = "[";
    private final static String closeSquareBracket = "]";
    private final static String openParentheses = "{";
    private final static String closeParentheses = "}";

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            boolean isBalance = isBalance(input);
            System.out.println(isBalance);
        }

    }

    private static boolean isBalance(String input) {
        String[] s = input.split("");
        Stack<String> stack = new Stack<>();
        for (String symbol : s) {
            if (symbol.equals(openParentheses) || symbol.equals(openSquareBracket) || symbol.equals(openBracket)) {
                stack.push(symbol);
            } else if (stack.empty()) {
                return false;
            } else if (symbol.equals(closeParentheses)) {
                if (!Objects.equals(stack.pop(), openParentheses)) return false;
            } else if (symbol.equals(closeBracket)) {
                if (!Objects.equals(stack.pop(), openBracket)) return false;
            } else if (symbol.equals(closeSquareBracket)) {
                if (!Objects.equals(stack.pop(), openSquareBracket)) return false;
            }
        }
        return stack.empty();
    }

}
