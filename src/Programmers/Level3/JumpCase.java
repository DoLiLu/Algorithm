package Programmers.Level3;

public class JumpCase {
    public int jumpCase(int num) {
        int answer;
        if (num <= 2) return num;
        answer = jumpCase(num-1) + jumpCase(num-2);
        return answer;
    }
}
