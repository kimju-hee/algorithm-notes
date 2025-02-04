import java.util.HashSet;

class 방문길이 {
    public int solution(String dirs) {
        HashSet<String> hashSet = new HashSet<>();
        int originX = 0;
        int originY = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char s = dirs.charAt(i);
            int newX = x;
            int newY = y;

            if (s == 'U') {
                if (y < 5) newY++;
            } else if (s == 'D') {
                if (y > -5) newY--;
            } else if (s == 'L') {
                if (x > -5) newX--;
            } else if (s == 'R') {
                if (x < 5) newX++;
            }

            if (x != newX || y != newY) {
                String path1 = x + "," + y + "," + newX + "," + newY;
                String path2 = newX + "," + newY + "," + x + "," + y;
                hashSet.add(path1);
                hashSet.add(path2);
            }

            x = newX;
            y = newY;
        }

        System.out.println(hashSet.size());
        return hashSet.size() / 2;
    }
}

    public static void main(String args[]) {
        방문길이 방문 = new 방문길이();
        방문.solution("LULLLLLLU");  // 7
    }
}
