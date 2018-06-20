package Codility.Lesson3;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int len = A.length;
        int [] sumArray = new int [len];
        int sum = 0;
        for(int i=0; i <len; i ++){
            sum += A[i];
            sumArray[i] = sum;
        }

        for(int j=0; j<len-1; j++){
            if(min > Math.abs(sumArray[j] - (sum-sumArray[j])))
                min = Math.abs(sumArray[j] - (sum-sumArray[j]));
        }
        return min;
    }
}
