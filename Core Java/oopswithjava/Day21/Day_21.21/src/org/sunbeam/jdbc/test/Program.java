package org.sunbeam.jdbc.test;

class TickTock{
	//TickTock this = tt;
	public void tick( ) throws InterruptedException {
		synchronized( this ) {
			System.out.print("Tick	");
			this.notify();
			this.wait(1000);	//To avoid deadlock
		}
	}
	//TickTock this = tt;
	public void tock( ) throws InterruptedException {
		synchronized( this ) {
			System.out.println("	Tock");
			this.notify();
			this.wait(1000);	//To avoid deadlock
		}
	}
}
class Task implements Runnable{
	Thread thread;
	public Task( String name ) {
		this.thread = new Thread(this, name );
		this.thread.start();
	}
	static TickTock tt = new TickTock();
	@Override
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("TickThread")) {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tick();
					Thread.sleep(300);
				}
			}else {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tock();
					Thread.sleep(300);
				}
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException( cause );
		}
	}
}
public class Program {
	public static void main(String[] args)  {
		Task t2 = new Task( "TockThread" );
		Task t1 = new Task( "TickThread" );
		
	}
}
