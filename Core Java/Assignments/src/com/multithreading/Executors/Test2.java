
package com.multithreading.Executors;
class SecondTask extends Thread
{
    private static int count = 0;
    private int id;

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("<"+ id + "Tik Tit - "+i);
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public SecondTask() {
        this.id = ++count;
    }
}
public class Test2 {
    
    public static void main(String[] args) {
        System.out.println("Main thread start...");
        
        new SecondTask().start();
        Thread t = new SecondTask();
        t.start();
        
        System.out.println("Main thread ends here...");
    }
    
}
