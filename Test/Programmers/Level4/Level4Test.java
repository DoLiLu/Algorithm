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
    @Test
    public void FindLargestSquareTest(){
        FindLargestSquare largest = new FindLargestSquare();
        char [][]board ={
                {'O','O','O','O','O'},
                {'O','O','O','O','O'},
                {'O','O','O','O','O'},
                {'O','O','O','O','O'},
                {'O','O','O','O','O'}};

        assertThat(largest.findLargestSquare(board), is(25));
    }
    @Test
    public void HopscotchTest(){
        Hopscotch c = new Hopscotch();
        int[][] test = { { 7, 10, 1, 1}, {7, 7, 1, 10}, {3, 3, 5, 2}, {8, 10, 4, 2}, {6, 1, 8, 9}, {1, 3, 7, 3}, {2, 10, 3, 5}, {2, 1, 5, 6}, {4, 2, 1, 7}, {3, 5, 2, 7} };
        assertThat(c.hopscotch(test, 10), is(78));
    }
    @Test
    public void TilingTest(){
        Tiling t = new Tiling();
        assertThat(t.tiling(10), is(89));
    }

}
