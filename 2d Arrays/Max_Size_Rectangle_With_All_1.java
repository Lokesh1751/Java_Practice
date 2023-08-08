import java.util.*;

class largeareainhistogram {
    public static int[] prevsmaller(int[] heights) {
        int ps[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public static int[] nextsmaller(int[] heights) {
        int ps[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = heights.length;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public static int largestRectangleArea(int[] heights) {
        int maxans = 0;
        int ps[] = prevsmaller(heights);
        int ns[] = nextsmaller(heights);
        for (int i = 0; i < heights.length; i++) {
            int curr = (ns[i] - ps[i] - 1) * heights[i];
            maxans = Math.max(maxans, curr);
        }
        return maxans;
    }

    public static int largestarea(int arr[][]) {
        int currow[] = arr[0];
        int maxans = largestRectangleArea(currow);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    currow[j] += 1;
                } else {
                    currow[j] = 0;
                }
                int curans = largestRectangleArea(currow);
                maxans = Math.max(maxans, curans);
            }
        }
        return maxans;
    }

    public static void main(String[] args) {
        int rectangle[][] = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println(largestarea(rectangle));
    }
}

//GFG
//Maximum size rectangle binary sub-matrix with all 1s
