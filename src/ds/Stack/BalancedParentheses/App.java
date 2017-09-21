package ds.Stack.BalancedParentheses;
import java.util.Stack;
public class App {
    public static void main(String[] args) {
        String a = "[{()}]";
        boolean isBalanced= checkBalanced(a);
        System.out.print(isBalanced);
    }

    public static boolean checkBalanced(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                stack.push(c[i]);
            } else if (stack.isEmpty() || !pairs(stack.peek() ,c[i])) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean pairs(char top, char c) {
        if (top == '(') {
            return c == ')';
        } else if (top == '{') {
            return c == '}';
        } else {
            return c == ']';
        }
    }
}
