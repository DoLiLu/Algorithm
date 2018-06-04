package Programmers.Level3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Level3Test {
    @Test
    public void S124Test() {
            assertThat(S124.solution(4), is("11"));
            assertThat(S124.solution(10), is("41"));
            assertThat(S124.solution(21), is("144"));
            assertThat(S124.solution(39), is("444"));
    }
    @Test
    public void NLCMTest() {
        NLCM nc = new NLCM();
        int[] ex = { 39, 56, 34, 39, 9, 35, 38, 94, 39, 79 ,80, 97, 87};
        assertThat(nc.nlcm(ex), is(221040112260240L));
    }
}
