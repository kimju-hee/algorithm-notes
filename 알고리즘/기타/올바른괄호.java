import java.util.Stack;

class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    stack.add(c);
                }
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

    public static void main(String args[]) {
        올바른괄호 a = new 올바른괄호();
        a.solution("()()");
    }
}