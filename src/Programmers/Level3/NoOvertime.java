package Programmers.Level3;

import java.util.Arrays;

public class NoOvertime {
    public int noOvertime(int no, int[] works) {
        int result = 0;
        int len = works.length;
        for(int i=0; i<no; i++){
            Arrays.sort(works);
            works[len-1] --;
        }
        for(int res : works)
            result += res * res;
        return result;
    }
}
