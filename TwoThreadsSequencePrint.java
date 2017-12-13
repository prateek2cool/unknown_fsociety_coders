
public class TwoThreadsSequencePrint{

	static Object lock = new Object();
	public static void main(String[] args) throws InterruptedException {
	Thread t = new Thread(new Runnable(){

		@Override
		public void run() {
			synchronized(lock){
			for(int itr=1;itr<11;itr=itr+2){
				System.out.println("Thread 1: "+ itr);
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
	
	});
	Thread t1 = new Thread(new Runnable(){

		@Override
		public void run() {
			synchronized(lock){
			for(int itr=2;itr<11;itr=itr+2){
				System.out.println("Thread 2: "+ itr);
				if(itr==10)
					break;
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}	
		}});
	t.start();
	Thread.sleep(200);
	t1.start();
	t.join();
	t1.join();
	System.out.println("Complete");
	}
}