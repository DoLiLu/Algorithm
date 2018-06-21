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
}
