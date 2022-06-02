package com.multithreading.Executors;

public class Email implements Runnable{
	private static int count = 0;
    private int id;
	@Override
	public void run() {
		System.out.println("#### <TASK-" + id + ">"+Thread.currentThread().getName()+" START MAIL SENDING ####");

        for (int i = 10; i > 0; i--) {
            System.out.println("E-Mail Successfull = " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("**** <TASK-" + id + "> COMPLETED ****");
    }
	
}
