package Programmers.Level4;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Level4Test {
    @Test
    public void HoTest(){
        assertThat(Ho.solution(4), is(11));
        assertThat(Ho.solution(3), is(5));
    }
    @Test
    public void BestSetTest(){
        BestSet bs = new BestSet();
        assertThat(Arrays.toString(bs.bestSet(3, 13)), is("[4, 4, 5]"));
        assertThat(Arrays.toString(bs.bestSet(3, 15)), is("[5, 5, 5]"));
    }
    @Test
    public void ExpressionsTest(){
        Expressions expressions = new Expressions();
        assertThat(expressions.expressions(1927), is(4));
    }

}
