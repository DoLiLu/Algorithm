package Codility.Lesson4;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lesson4Test {
    @Test
    public void FrogRiverOneTest(){
        int []A = {1,3,1,4,2,3,5,4};
        assertThat(FrogRiverOne.solution(5,A ), is(6));
    }
    @Test
    public void MissingIntegerTest(){
        int []A = {0,1,2,3,5};
        assertThat(MissingInteger.solution(A), is(4));
    }
    @Test
    public void PermCheckTest(){
        int []A = {1,3,4};
        assertThat(PermCheck.solution(A), is(0));
    }
}
