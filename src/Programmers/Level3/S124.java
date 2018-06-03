package Programmers.Level3;

public class S124 {
    public static String solution(int n) {
        StringBuilder res = new StringBuilder();
        int mod = 0;

        while (n > 0) {
            mod = n % 3;
            n = n / 3;
            if (mod == 0) {
                n = n-1;
                mod = 4;
            }
            res.append(mod);
        }
        return res.reverse().toString();
    }
}
