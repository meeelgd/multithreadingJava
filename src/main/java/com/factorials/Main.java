package com.factorials;

public class Main {

    public static void main(String args[]) throws InterruptedException {

        /** 1- SINGLE PROCESS **/

        System.out.println("1- SINGLE PROCESS");

        long start = System.currentTimeMillis();

        Factorial fact1 = new Factorial();
        Factorial fact2 = new Factorial();
        Factorial fact3 = new Factorial();

        System.out.println("Factorial of 225464564 is: " + fact1.getFib(225464564));
        System.out.println("Factorial of 570557500 is: " + fact2.getFib(570557500));
        System.out.println("Factorial of 444442452 is: " + fact3.getFib(444442452));

        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end- start) / 1000F; System.out.println(sec + " seconds");

         /** 2- MULTI THREADED PROCESS **/

        System.out.println("\n2- MULTI THREADED PROCESS");

        long start2 = System.currentTimeMillis();

        FactorialMultithreaded factThreaded1 = new FactorialMultithreaded(225464564);
        FactorialMultithreaded factThreaded2 = new FactorialMultithreaded(570557500);
        FactorialMultithreaded factThreaded3 = new FactorialMultithreaded(444442452);

        Thread t1 = new Thread(factThreaded1);
        Thread t2 = new Thread(factThreaded2);
        Thread t3 = new Thread(factThreaded3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Factorial of 225464564 is: " + factThreaded1.getResult());
        System.out.println("Factorial of 570557500 is: " + factThreaded2.getResult());
        System.out.println("Factorial of 444442452 is: " + factThreaded3.getResult());

        long end2 = System.currentTimeMillis();

        float sec2 = (end2 - start2) / 1000F; System.out.println(sec2 + " seconds");

    }
}
