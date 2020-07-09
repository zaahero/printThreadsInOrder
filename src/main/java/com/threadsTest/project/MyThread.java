package com.threadsTest.project;

public class MyThread implements Runnable{

    private String value;



    @Override
    public void run() {
        try {
            synchronized(this) {
              //  Thread.sleep(500);
                value = Thread.currentThread().getName();
                if(Thread.currentThread().getName().equals("T2")){
                    Thread.sleep(2000);
                }
                System.out.println("hello " +Thread.currentThread().getName());
                final String print = "hello " +Thread.currentThread().getName();
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}

