package Programmers.Java8;

import java.util.stream.IntStream;

public class Divisible {
    public static int[] divisible(int[] array, int divisior) {
        return IntStream.of(array).filter(i -> i % divisior ==0).toArray();
    }
}
