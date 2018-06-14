package Programmers.Level4;

public class Tiling {
    public static int tiling(int n) {
        int answer = 0 ;
        int[] tiling = new int[n+1];
        tiling[1] = 1;
        tiling[2] = 2;
        for (int i=3; i<=n; i++){
            tiling[i] = (tiling[i-2] + tiling[i-1]) % 1000000007;
        }
        answer = tiling[n];
        return answer;
    }
}
