package Codility.Lesson4;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        int res = 0;
        int [] cnt = new int [X];
        for(int i=0; i < X; i ++)
            cnt[i] = 0;

        for(int j=0; j< A.length; j++) {
            if(cnt[A[j]-1]==0){
                cnt[A[j]-1] = 1;
                res ++;
            }
            if(res == X)
                return j;
        }

        return -1;
    }
}
