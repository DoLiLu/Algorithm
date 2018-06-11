package Programmers.Level4;

public class Expressions {
    public int expressions(int num) {
        int answer = 0;
//        int init = num;
//
//        for(int i=1; i<= init; i ++){
//            for(int j=i; j<= init; j ++){
//                num = num -j;
//                if(num == 0)
//                    answer++;
//                if(num <=0) {
//                    num = init;
//                    break;
//                }
//            }
//        }

//      주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }



        return answer;
    }
}
