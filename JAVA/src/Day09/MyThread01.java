package Day09;

public class MyThread01 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			public void run() {
				for(int i =0; i<100000; i++) {
					System.out.print(i + " ");
					if(i%100 == 0) { System.out.println();}
				}

			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				for(int i =0; i<100000; i++) {
					System.out.print((char)i + " ");
					if(i%100 == 0) { System.out.println();}
				}

			}
		}).start();
	}
	
	
}
