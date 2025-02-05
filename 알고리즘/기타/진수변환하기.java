import java.util.Stack;

public class 진수변환하기 {
    public static String solution(int demical) {
        Stack<Integer> stack = new Stack<>();

        while (demical > 0) {
            int reminder = demical % 2;
            stack.push(reminder);
            demical /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
