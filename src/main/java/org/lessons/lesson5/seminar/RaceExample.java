package org.lessons.lesson5.seminar;

import java.util.concurrent.CountDownLatch;

public class RaceExample {

    //Создаем CountDownLatch 3 бегуна, плюс три команды
    private static final CountDownLatch START = new CountDownLatch(6);
    private static final int trackLength = 5000; //длина трассы

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            new Thread(new Runner(i, (int) (Math.random() * 10 + 5))).start();
            Thread.sleep(1000);
        }

        while (START.getCount() > 3) { //Проверяем, собрались ли все бегуны
            Thread.sleep(100);
        }


        Thread.sleep(1000);
        System.out.println("На старт!");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Внимание!");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Марш!");
        START.countDown();
    }

    public static class Runner implements Runnable {
        private int carId;
        private int speed;

        public Runner(int carId, int speed) {
            this.carId = carId;
            this.speed = speed;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Бегун №%d подошел к старту.\n", carId);
                START.countDown();
                START.await();
                Thread.sleep(trackLength / speed);//ждем пока проедет трассу
                System.out.printf("Бегун №%d финишировал!\n", carId);
            } catch (InterruptedException e) {
            }
        }
    }
}
