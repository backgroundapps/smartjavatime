package io.github.jonatasemidio.jst.projecteuler;

/**
 * Created by Samsung on 26/04/2017.
 */
public class ProjectEuler {
    public int multipleOf3or5(){
        int num = 0;
        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) num += i;
        }
        return num;
    }
}
