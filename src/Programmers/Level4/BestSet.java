package Programmers.Level4;

import java.util.Arrays;

public class BestSet {
    public int[] bestSet(int n, int s) {
        int[] answer;
        if (n > s) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[n];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = s / n;
                s = s - answer[i];
                n = n - 1;
                if (n == 1) {
                    answer[i + 1] = s;
                    break;
                }
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}
