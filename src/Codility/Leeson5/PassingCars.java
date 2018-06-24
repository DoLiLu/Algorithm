package Codility.Leeson5;

public class PassingCars {
    public static int solution(int[] A) {
        int toEast = 0;
        long pairCount = 0;

        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == 0){
                toEast++;
            } else{
                pairCount += toEast;
            }
        }

        if(pairCount > 1000000000){
            return -1;
        }

        return (int)pairCount;
    }
}
