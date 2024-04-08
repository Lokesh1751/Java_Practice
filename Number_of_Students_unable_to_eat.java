class Solution {
    public int countStudents(int[] stud, int[] sand) {
        Queue<Integer> q = new LinkedList<>();

        for (int num : stud) {
            q.add(num);
        }

        int i = 0;

        while(q.contains(sand[i])){

            if (q.peek() == sand[i]){
                i++;
                q.poll();
            }
            else q.add(q.poll());

            if (q.size() == 0)break;

        }

        return q.size();
    }
}
//LEETCODE
