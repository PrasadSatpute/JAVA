
package interview.multithreading;

class TaskEvenOdd implements Runnable{

    static int counter = 1;
    int reminder;
    
    static Object lock = new Object();

    public TaskEvenOdd(int reminder) {
        this.reminder = reminder;
    }
    
    public void printer(){
        System.out.println(Thread.currentThread().getName()+" "+counter++);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(lock){
            while (counter % 2 != reminder) {                
                try {
                    lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            printer();
            lock.notifyAll();
            }
        }
    }
    
}

public class OddEvenSynchronization {
    public static void main(String[] args) {
       
        TaskEvenOdd even = new TaskEvenOdd(0);
        TaskEvenOdd odd = new TaskEvenOdd(1);
        
        Thread e = new Thread(even,"Even Thread");
        Thread o = new Thread(odd,"Odd Thread");
        
        e.start();
        o.start();
        
    }
}
