package Programmers.Level3;

import org.junit.Test;

import java.util.Arrays;

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
    @Test
    public void LineCombinationTest() {
        LineCombination lc = new LineCombination();
        System.out.println(Arrays.toString(lc.setAlign(4, 6)));
    }
    @Test
    public void CaesarTest() {
        Caesar c = new Caesar();
        assertThat(c.caesar("BcOQobnQQu WQEzNbNiJKYji BgeJidOfeGQLgDyWJkjqQztt", 40), is("PqCEcpbEEi KESnBpBwXYMxw PusXwrCtsUEZuRmKXyxeEnhh"));
    }
    @Test
    public void NextBigNumberTest() {
        NextBigNumber nb = new NextBigNumber();
        assertThat(nb.nextBigNumber(78), is(83));
    }
    @Test
    public void NoOvertimeTest() {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        assertThat(c.noOvertime(4,test), is(12));
    }
}
