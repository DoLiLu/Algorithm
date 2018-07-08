package Programmers.Java8;

import java.util.stream.IntStream;

public class GetMean {
    public int getMean(int[] array) {
        return (int) IntStream.of(array).average().orElse(0);
    }
}
