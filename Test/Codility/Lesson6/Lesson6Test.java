package Codility.Lesson6;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lesson6Test {
    @Test
    public void NumberOfDiscIntersectionsTest(){
        int []A = {1,10,100,1};
        assertThat(NumberOfDiscIntersections.solution(A), is(6));
    }
}
