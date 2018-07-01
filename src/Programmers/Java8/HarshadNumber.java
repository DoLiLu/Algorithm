package Programmers.Java8;

public class HarshadNumber {
    int res = 0;
    public boolean isHarshad(int num) {
        Integer.toString(num).chars().forEach(i -> res += (i - '0'));
        return num % res == 0;
    }
}
