package Codility.Lesson5;

import Codility.Leeson5.GenomicRangeQuery;
import Codility.Leeson5.PassingCars;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lesson5Test {
    @Test
    public void PassingCarsTest(){
        int []A = {0,1,0,1,1};
        assertThat(PassingCars.solution(A), is(5));
    }
    @Test
    public void GenomicRangeQueryTest(){
        int []A = {2,5,0};
        int []B = {4,5,6};
        int [] res = GenomicRangeQuery.solution("CAGCCTA",A, B );
        for(int r : res)
            System.out.print(r + " ");
    }
}
