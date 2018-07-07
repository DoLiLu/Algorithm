package Programmers.Java8;

import java.util.stream.IntStream;

public class GetMinSum {
    public int getMinSum(int []A, int []B) {
        int answer = 0;
        int []first = IntStream.of(A).sorted().toArray();
        int []second = IntStream.of(B).sorted().toArray();
        int len = first.length;
        for(int i=0; i< len; i++)
            answer += first[i] * second[len-1-i];
        return answer;
    }
}
