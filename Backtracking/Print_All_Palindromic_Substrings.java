public class pp {
    public static boolean checkpalind(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void findsubstrings(String str, int start, int end) {
        if (end == str.length()) {
            return;
        }
        if (start > end) {
            findsubstrings(str, 0, end + 1);
        } else {
            String s = "";
            for (int i = start; i < end; i++) {
                s += str.charAt(i);
            }
            s += str.charAt(end);
            if (checkpalind(s)) {
                System.out.println(s);
            }
            findsubstrings(str, start + 1, end);
        }
        return;
    }

    public static void main(String[] args) {
        String str = "nitin";
        findsubstrings(str, 0, 0);
    }
}
