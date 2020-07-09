package com.threadsTest.project;

public class Output {

    public String printOutput(int value){
        while(value != 0) {
            value--;
            try{
                Thread t1 = new Thread(new MyThread(), "T1");
                Thread t2 = new Thread(new MyThread(), "T2");
                Thread t3 = new Thread(new MyThread(), "T3\n");

                t1.start();
                t1.join();
                t2.start();
                t2.join();
                t3.start();
                t3.join();
            }
            catch(InterruptedException ie){
                System.err.println(ie);
            }
        }

        return "";

    }

}
