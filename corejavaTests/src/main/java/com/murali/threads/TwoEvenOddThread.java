package com.murali.threads;

class PrintEO {

	public synchronized void printEven() throws InterruptedException {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);				
					Thread.sleep(1000);
				notifyAll();
			} else {
					wait();
			}
			i++;
		}
	}
	public synchronized void printOdd() throws InterruptedException {
		int i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
				System.out.println(i);
					Thread.sleep(1000);
				notifyAll();
			} else {
					wait();
			}
			i++;
		}
	}

}
class Threads implements Runnable {

	PrintEO p = new PrintEO();
	String opr ;
	
	Threads(PrintEO p, String opr)	{
		this.p = p;
		this.opr = opr;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(opr.equals("even")) {
			try {
				p.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(opr.equals("odd")) {
			try {
				p.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class TwoEvenOddThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PrintEO p = new PrintEO(); 
		//p.printEven();
		p.printOdd();
//		new Thread(new Threads(p,"even")).start();
//		new Thread(new Threads(p,"odd")).start();
	}

}
