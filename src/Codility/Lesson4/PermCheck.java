package Codility.Lesson4;

import java.util.Arrays;

public class PermCheck {
    public static int solution(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        if(len == 1 && A[0]!=1)
            return 0;
        for(int i = 0; i< len -1; i++){
            if(A[0]!=1)
                return 0;
            if(!(A[i]+1==A[i+1]))
                return 0;
        }
        return 1;
    }
}
