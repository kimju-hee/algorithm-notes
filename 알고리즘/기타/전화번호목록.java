import java.util.HashSet;

class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        // 모든 전화번호를 HashSet에 저장
        for (String phone : phone_book) {
            set.add(phone);
        }

        // 각 전화번호의 접두사가 HashSet에 존재하는지 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
