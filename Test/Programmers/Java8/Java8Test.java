package Programmers.Java8;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Java8Test {
    @Test
    public void ReverseIntTest() {
        ReverseInt ri = new ReverseInt();
        assertThat(ri.reverseInt(118372), is(873211));
    }

    @Test
    public void HarshadNumberTest() {
        HarshadNumber hn = new HarshadNumber();
        assertThat(hn.isHarshad(18), is(true));
    }
    @Test
    public void DayNameTest() {
        DayName dayName = new DayName();
        int a=5, b=24;
        assertThat(dayName.getDayName(a,b), is("TUE"));
    }
    @Test
    public void DivisibleTest() {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
