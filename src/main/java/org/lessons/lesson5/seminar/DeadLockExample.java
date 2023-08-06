package org.lessons.lesson5.seminar;

public class DeadLockExample {

    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Thread t1 = new Thread() {
            public void run() {
                synchronized (objectA) {
                    System.out.println("Thread 1: locked objectA");

                    try { objectA.testA();} catch (Exception e) {}

                    synchronized (objectB) {
                        System.out.println("Thread 1: locked objectB");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (objectB) {
                    System.out.println("Thread 2: locked objectB");

                    try { objectB.testB();} catch (Exception e) {}

                    synchronized (objectA) {
                        System.out.println("Thread 2: objectA");
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }

    public static class ObjectA {
        private String strA;
        private String valueA;
        private Integer valA;

        public void testA() throws InterruptedException {
            Thread.sleep(1000);
        }

    }

    public static class ObjectB {

        private String strB;
        private String valueB;
        private Integer valB;

        public void testB() throws InterruptedException {
            Thread.sleep(1000);
        }
    }
}
