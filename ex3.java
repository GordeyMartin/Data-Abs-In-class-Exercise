import java.util.Stack;

public class ex3 {
    public static void main(String[] args) {
        String example = "({[]})))";
        System.out.println(isValid(example));
    }

    public static boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Stack <Character> check = new Stack<Character>();
        char[] initialArray = s.toCharArray();

        for (int g = 0; g < s.length(); g++) {
            char i = initialArray[g];
            if (i == '(' || i == '[' || i == '{') {
                check.push(i);
            }
            else {
                if (check.isEmpty()) {
                    return false;
                }
                if (!((i == ')' && check.pop() == '(') || (i == ']' && check.pop() == '[') || (i == '}' && check.pop() == '{'))) {
                    return false;
                }
            }
            
        }
        if (check.isEmpty()) {
            return true;
        }
        return false;
        
    }
}