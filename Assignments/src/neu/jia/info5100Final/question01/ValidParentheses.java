package neu.jia.info5100Final.question01;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        //create a stack to store input
        Stack<Character> stack = new Stack();

        //iterate input string
        for (char c : s.toCharArray()) {
            //if ( [ {, just push into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            //if ) ] }, three possibilities
            } else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
