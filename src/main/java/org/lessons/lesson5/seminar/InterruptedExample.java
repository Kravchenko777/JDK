package org.lessons.lesson5.seminar;

import java.util.concurrent.TimeUnit;

public class InterruptedExample {

    static volatile boolean switcher = false;

    public static void main(String[] args) {

        Thread thread1 =  new Thread( () -> {
            while (true && !Thread.interrupted()) {
                try {
                    Thread.sleep(1000);
                    switcher = !switcher;
                } catch (InterruptedException e) {
                    System.exit(0);
                }
            }
        });

        //  Можно реализовать через демон поток
        //  thread1.setDaemon(true);

        Thread thread2 = new Thread( () -> {
            int i = 30;
            while (i >= 0) {
                if (switcher) {
                    try {
                        System.out.println(i);
                        i--;
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            thread1.interrupt();
        });
        thread1.start();
        thread2.start();
    }
}
