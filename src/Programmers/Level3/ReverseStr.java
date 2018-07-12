package Programmers.Level3;

import java.util.Arrays;

public class ReverseStr {
    public static String reverseStr(String test) {
        char[] temp = test.toCharArray();
        Arrays.sort(temp);
        return new StringBuilder(new String(temp)).reverse().toString();
    }
}
