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
    @Test
    public void GetMinMaxStringTest() {
        String str = "-12 -13 -17 -5 -7 14 14 18 4 5 5 8";
        GetMinMaxString minMax = new GetMinMaxString();
        assertThat(minMax.getMinMaxString(str), is ("-17 18"));
    }
    @Test
    public void GetMinSumTest() {
        GetMinSum minSum = new GetMinSum();
        int []A = {1,2};
        int []B = {3,4};
        assertThat(minSum.getMinSum(A,B), is (10));
    }
}
