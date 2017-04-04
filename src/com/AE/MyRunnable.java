package com.AE;

/**
 * Created by Angel on 3/4/17.
 */

import static com.AE.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my Runnable's implementation of run.");
    }
}
