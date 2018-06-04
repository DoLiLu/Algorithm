package Programmers.Level3;

public class NLCM {
    public long nlcm(int[] num) {
        long answer = num[0],g;
        for(int i=1;i<num.length;i++){
            g=gcd(answer,num[i]);
            answer=g*(answer/g)*(num[i]/g);
        }
        return answer;
    }
    public long gcd(long a,long b){
        if(a>b)
            return (a%b==0)? b : gcd(b,a%b);
        else
            return (b%a==0)? a : gcd(a,b%a);
    }
}
