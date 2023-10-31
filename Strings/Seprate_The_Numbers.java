import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {

    public static void separateNumbers(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("NO");
            return;
        }

        int length = s.length();
        boolean isBeautiful = false;

        for (int i = 1; i <= length / 2; i++) {
            long firstNumber = Long.parseLong(s.substring(0, i));
            StringBuilder beautifulString = new StringBuilder(String.valueOf(firstNumber));

            while (beautifulString.length() < length) {
                beautifulString.append(++firstNumber);
            }

            if (beautifulString.toString().equals(s)) {
                isBeautiful = true;
                System.out.println("YES " + s.substring(0, i));
                break;
            }
        }

        if (!isBeautiful) {
            System.out.println("NO");
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();
                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

//HACKERRANK
