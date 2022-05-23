package com.multithreading.Executors;

public class LoopTaskA implements Runnable {

    private static int count = 0;
    private int id;

    @Override
    public void run() {
        System.out.println("#### <TASK-" + id + "> STARTING ####");

        for (int i = 10; i > 0; i--) {
            System.out.println("Tik Tit - " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("**** <TASK-" + id + "> COMPLETED ****");
    }
    
    public LoopTaskA(){
        this.id = ++count;
    }

}
