import java.util.ArrayList;

public class preservedspace {
    public static void main(String[] args) {
        String str = "Java is fun!";
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                al.add(i);
            }
        }
        StringBuilder s = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                s.append(str.charAt(i));
            }
        }
        for (Integer i : al) {
            s.insert(i, " ");
        }
        System.out.println(s.toString());
    }
}
