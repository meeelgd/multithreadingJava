package com.factorials;


public class FactorialMultithreaded implements Runnable {

    public int number;
    public long result;



    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    FactorialMultithreaded(int number) {
        this.number = number;
    }

    // n! = n x (n-1) x (n-2) x .... x 1
    public void getFib(long pos){
        long first = 0;
        long second = 1;
        long finalres = 0;
        for (int cnt=1; cnt<pos; cnt++){
            finalres = first + second;
            first = second;
            second = finalres;
        }
        setResult(finalres);
    }


    public void run(){


        getFib(number);


    }
}

