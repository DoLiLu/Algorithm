package Codility.Lesson3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lesson3Test {
    @Test
    public void PermMissingElemTest(){
        int []a = {1,2,4,5,6,7,8,9,10,11,12,13,14,15};
        assertThat(PermMissingElem.solution(a), is(3));
    }
}
