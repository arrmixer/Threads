package com.AE;

import static com.AE.ThreadColor.*;
public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the naonymouse class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED+ "Hello from the anonymouse class's implemenation of run");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm runnning again.");
                }catch(InterruptedException e){
                    System.out.println(ANSI_RED + "I counldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();

//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");



    }
}
