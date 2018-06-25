package Codility.Leeson5;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        int len = P.length;
        int [] res = new int [len];
        int a;
        for(int i =0; i< len; i++){
            a = S.substring(P[i], Q[i]+1).chars().distinct().sorted().findFirst().getAsInt();

            if(a == 65)
                res[i] = 1;
            else if(a == 67)
                res[i] = 2;
            else if(a == 71)
                res[i] = 3;
            else if(a == 84)
                res[i] = 4;
        }

        return res;
    }
}
