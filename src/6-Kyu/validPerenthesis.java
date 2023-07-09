import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                return false;
            }

            if (c == ')' && stack.peek() == '(' || c == '}' && stack.peek() == '{' || c == ']' && stack.peek() == '[' ) {
                stack.pop();
            } else {
                return false;
            }
        }
    }
    return stack.empty();
}
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
