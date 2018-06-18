package Programmers.Level4;

public class Tiling3 {
    public static int tiling3(int n) {
        int answer = 0;
        int add = 0;
        if (n == 2 )
            return 3;

        int div=0;
        div = n / 2 ;
        if(n % 4 == 0)
            add = n / 4 ;

        answer = (int) Math.pow(3,div) + (2 * add);

        return answer;
    }
}
