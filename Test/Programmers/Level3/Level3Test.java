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
}
