package Programmers.Java8;

import java.util.stream.IntStream;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] res = str.split(" ");
        int ren=res.length;
        int[] intRes = new int[ren];
        for(int i=0; i < ren; i ++) {
            intRes[i] = Integer.parseInt(res[i]);
        }
        int[] temp =  IntStream.of(intRes).sorted().toArray();
        return Integer.toString(temp[0]) + " " + Integer.toString(temp[ren-1]);
    }
}
