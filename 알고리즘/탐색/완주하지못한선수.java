import java.util.HashMap;
import java.util.Map;

class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (map.containsKey(participant[i])) {
                int value = map.get(participant[i]);
                map.put(participant[i], value+1);
            } else {
                map.put(participant[i], 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            String name = completion[i];
            if (map.containsKey(name)) {
                int value = map.get(name);
                map.put(name, value -= 1);
            }
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            String name = m.getKey();
            int value = m.getValue();
            if (value != 0) {
                answer += name;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String args[]) {
        String[] input = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] n = new String[]{"josipa", "filipa", "marina", "nikola"};

        완주하지못한선수 a = new 완주하지못한선수();
        a.solution(input, n);
    }
}