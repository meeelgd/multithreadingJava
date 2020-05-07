package com.factorials;


public class Factorial {

    public static long getFib(long pos){
        long first = 0;
        long second = 1;
        long finalres = 0;
        for (int cnt=1; cnt<pos; cnt++){
            finalres = first + second;
            first = second;
            second = finalres;
        }
        return finalres;
    }

    // n! = n x (n-1) x (n-2) x .... x 1
    public static long factorial(long n) {


        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }


}





