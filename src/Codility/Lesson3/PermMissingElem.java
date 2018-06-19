package Codility.Lesson3;

public class PermMissingElem {
    public static int solution(int[] A) {
        int len = A.length;
        int [] res = new int [len+1];
        int init;

        for(int i=1; i<=len+1; i ++)
            res[i-1] = i;
        init = res[len];
        for(int j=0; j<len; j++) {
            init = init ^ res[j] ^ A[j];
        }
        return init;
    }
}
