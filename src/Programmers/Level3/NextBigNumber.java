package Programmers.Level3;

public class NextBigNumber {
    public int nextBigNumber(int n)
    {
        int answer= n+1;
        int cnt = Integer.bitCount(n);
        while(true){
            if(Integer.bitCount(answer)==cnt)
                break;
            answer++;
        }
        return answer;
    }
}
