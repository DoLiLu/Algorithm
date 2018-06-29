package Codility.Lesson6;

public class NumberOfDiscIntersections {
    public static int solution(int[] A) {
        int len = A.length;
        int [] res = new int [len];
        int min;
        int max;
        for (int i=0; i < len; i++) {
            res[i] = 0;
        }
        for (int i=0; i < len; i++) {
            if(A[i]==0)
                continue;

            min = i - A[i];
            max = i + A[i];
            for(int j=min; j <= max; j ++){
                if(j>=0 && j < len)
                    res[j] ++;
            }
        }
        int sum = 0;
        for(int re : res)
            sum += re;
        return sum / 2;
    }
}
