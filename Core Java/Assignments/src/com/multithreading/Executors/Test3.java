
package com.multithreading.Executors;
class ThirdTask implements Runnable
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

    public ThirdTask() {
        this.id = ++count;
        new Thread(this).start();
    }
}
public class Test3 {
    
    public static void main(String[] args) {
        System.out.println("Main thread start...");
        
        new ThirdTask();
        new ThirdTask();
        
        System.out.println("Main thread ends here...");
    }
    
}
