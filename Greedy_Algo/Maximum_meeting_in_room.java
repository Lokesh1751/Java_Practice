
class Solution {
    static class Pair {
        int start;
        int end;
        int index; // Store the original index of the meeting

        Pair(int start, int end, int index) {
            this.start = start;
            this.end = end;
            this.index = index;
        }
    }

    public static ArrayList<Integer> maxMeetings(int N, int[] start, int[] end) {
        ArrayList<Integer> result = new ArrayList<>();
        Pair[] meetings = new Pair[N];

        for (int i = 0; i < N; i++) {
            meetings[i] = new Pair(start[i], end[i], i + 1);
        }
        Arrays.sort(meetings, Comparator.comparingInt(a -> a.end));

        // Select meetings greedily
        int currentEnd = meetings[0].end;
        result.add(meetings[0].index);
        for (int i = 1; i < N; i++) {
            if (meetings[i].start > currentEnd) {
                result.add(meetings[i].index); 
                currentEnd = meetings[i].end;
            }
        }
        Collections.sort(result);

        return result;
    }
}
//GFG
