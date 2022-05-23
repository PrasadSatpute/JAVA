package com.multithreading.Executors;

public class Test5 {

    public static void main(String[] args) {
        System.out.println("Main thread start...");

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i > 0; i--) {
                    System.out.println("Tik Tit - " + i);
                    try {
                        Thread.sleep(250);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        System.out.println("Main thread ends here...");
    }

}
