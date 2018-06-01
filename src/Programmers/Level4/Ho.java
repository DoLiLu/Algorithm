package Programmers.Level4;

public class Ho {
    public static int solution(int n) {
        int answer;
        int hap=1, div=1;
        int count = 0;

        for(int i=n-1; i >=1; i--){
            hap *= (2 * n - 4) - count;
            div *= i ;
            count ++;
        }
        if(n==2)
            answer = 2 ;
        else
            answer = ( 2 * n - 2) * (2 * n - 2 -1) / 2 - (hap / div);

        return answer;
    }
}
