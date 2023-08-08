import java.util.HashMap;
import java.util.Map;

public class findcommonele {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 2, 4, 5, 8, 10 },
                { 3, 5, 7, 9, 11 },
                { 1, 3, 5, 7, 9 }
        };
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans.put(arr[i][j], ans.getOrDefault(arr[i][j], 0) + 1);
            }
        }
        int maxi = Integer.MIN_VALUE;
        int sol = 0;
        for (Map.Entry<Integer, Integer> me : ans.entrySet()) {
            if (me.getValue() > maxi) {
                maxi = me.getValue();
                sol = me.getKey();
            }

        }
        System.out.println(sol);
    }
}

//FIND A COMMON ELEMENT IN EACH ROW 
