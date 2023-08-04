import java.lang.reflect.Array;
import java.util.*;

public class printdup {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else if (ch != ' ') {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);
        for (Map.Entry<Character, Integer> h : hm.entrySet()) {
            if (h.getValue() > 1) {
                System.out.print(h.getKey() + " ");
            }
        }
    }
}
