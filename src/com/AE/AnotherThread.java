package com.AE;

/**
 * Created by Angel on 3/1/17.
 */
import static com.AE.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return; //terminate instance
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
