package Programmers.Java8;

import Programmers.Level3.S124;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Java8Test {
    @Test
    public void ReverseIntTest() {
        ReverseInt ri = new ReverseInt();
        assertThat(ri.reverseInt(118372), is(873211));
    }
}
