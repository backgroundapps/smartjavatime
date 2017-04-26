package io.github.jonatasemidio.jst.projecteuler;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Samsung on 26/04/2017.
 */
public class ProjectEulerTest {



    @Test
    public void testMultipleOf3Or5(){
        assertEquals(233168, new ProjectEuler().multipleOf3or5());

    }
}
