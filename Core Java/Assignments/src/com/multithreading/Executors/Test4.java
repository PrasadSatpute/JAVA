
package com.multithreading.Executors;
class ForthTask implements Runnable
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

    public ForthTask() {
        this.id = ++count;
    }
}
public class Test4 {
    
    public static void main(String[] args) {
        System.out.println("Main thread start...");
        
        new Thread(new ForthTask()).start();
        Thread t = new Thread(new ForthTask());
        t.start();
        
        System.out.println("Main thread ends here...");
    }
    
}