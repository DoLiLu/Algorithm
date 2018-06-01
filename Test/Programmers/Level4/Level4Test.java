package Programmers.Level4;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Level4Test {
    @Test
    public void HoTest(){
        assertThat(Ho.solution(4), is(11));
        assertThat(Ho.solution(3), is(5));
    }
}
