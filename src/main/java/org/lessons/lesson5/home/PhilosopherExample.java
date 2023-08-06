package org.lessons.lesson5.home;

import java.util.concurrent.Semaphore;

public class PhilosopherExample {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }

    static class Philosopher extends Thread {
        Semaphore sem;
        int num = 0; //приемы пищи
        int id; // номер философа

        Philosopher(Semaphore sem, int id) {
            this.sem = sem;
            this.id = id;
        }

        public void run() {
            try {
                while (num < 3) {
                    sem.acquire();
                    System.out.println("Философ " + id + " приступает к трапезе");
                    // философ ест
                    sleep(500);
                    num++;

                    System.out.println("Философ " + id + " завершает трапезу");
                    sem.release();

                    System.out.println("Философ " + id + " приступает к размышлениям");
                    sleep(1000);
                }
                System.out.println("Философ " + id + " поел");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
