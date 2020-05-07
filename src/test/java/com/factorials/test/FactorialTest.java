package com.factorials.test;
import org.junit.Assert;
import com.factorials.Factorial;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Test
    public void factorialTestEquals(){
        Assert.assertEquals(1, factorial.factorial(0));

        Assert.assertEquals(6, factorial.factorial(3));
    }

    @Test
    public void factorialTestNotEquals(){
        Assert.assertNotEquals(4, factorial.factorial(3));
    }

    @Test
    public void factorialTestGreater(){
        Assert.assertTrue(factorial.factorial(7) > factorial.factorial(2));
    }

    @Test
    public void factorialTimeAlgorithmTest() {
        int increment = 0;
        for (int i = 1; i <= factorial.factorial(8); i++){
            System.out.println("Hey - I'm busy looking at: " + i);
            if(i == 24) {
                increment = i;
            }
        }
        Assert.assertEquals(increment, 24);
        /**
         *
         * n is 4, this algorithm will run 4! = 24 times.
         * ANSWER : O(n) – Linear Time Algorithms : It grows linearly with the input size.
         * for example : if factorial(8) = will grow, and will run 40320 times
         */
    }

}
