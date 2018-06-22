package Codility.Lesson4;

import java.util.stream.IntStream;

public class MissingInteger {
    public static int solution(int[] A) {
        int[] res = IntStream.of(A).distinct().sorted().toArray();
        int len = res.length;
        int ret = 0;
        int min=0;
        if(res[len-1]<=0)
            return 1;

        for(int i=0; i < len-1; i ++){
            min = res[0];
            if(res[i]+1 != res[i+1]) {
                ret = res[i] + 1;
                if(ret < 0)
                    return 1;
                else
                    return ret;
            }
        }
        if(min<=1)
            return res[len-1]+1;

        return 1;
    }
}
