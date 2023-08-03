public class sentencetonumberseq {

    public static void main(String[] args) {
        String str = "Hello World";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' | ch == 'a') {
                ans += "2";
            } else if (ch == 'B' | ch == 'b') {
                ans += "22";
            } else if (ch == 'C' | ch == 'c') {
                ans += "222";
            } else if (ch == 'D' | ch == 'd') {
                ans += "3";
            } else if (ch == 'E' | ch == 'e') {
                ans += "33";
            } else if (ch == 'F' | ch == 'f') {
                ans += "333";
            } else if (ch == 'G' | ch == 'g') {
                ans += "4";
            } else if (ch == 'H' | ch == 'h') {
                ans += "44";
            } else if (ch == 'I' | ch == 'i') {
                ans += "444";
            } else if (ch == 'J' | ch == 'j') {
                ans += "5";
            } else if (ch == 'K' | ch == 'k') {
                ans += "55";
            } else if (ch == 'L' | ch == 'l') {
                ans += "555";
            } else if (ch == 'M' | ch == 'm') {
                ans += "6";
            } else if (ch == 'N' | ch == 'n') {
                ans += "66";
            } else if (ch == 'O' | ch == 'o') {
                ans += "666";
            } else if (ch == 'P' | ch == 'p') {
                ans += "7";
            } else if (ch == 'Q' | ch == 'q') {
                ans += "77";
            } else if (ch == 'R' | ch == 'r') {
                ans += "777";
            } else if (ch == 'S' | ch == 's') {
                ans += "7777";
            } else if (ch == 'T' | ch == 't') {
                ans += "8";
            } else if (ch == 'U' | ch == 'u') {
                ans += "88";
            } else if (ch == 'V' | ch == 'v') {
                ans += "888";
            } else if (ch == 'W' | ch == 'w') {
                ans += "9";
            } else if (ch == 'X' | ch == 'x') {
                ans += "99";
            } else if (ch == 'Y' | ch == 'y') {
                ans += "999";
            } else if (ch == 'Z' | ch == 'z') {
                ans += "9999";
            } else {
                ans += "0";
            }

        }

        System.out.println(ans);
    }

}

//Convert a sentence into its equivalent mobile numeric keypad sequence
//Brute Force method
///gfg
