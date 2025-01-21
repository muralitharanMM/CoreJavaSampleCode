package com.murali.classLevelLockThread;

public class ATMClass extends Thread {
	HDFC_Branch1 h1;
	
	
	

	public ATMClass(HDFC_Branch1 h1) {
		super();
		this.h1 = h1;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		HDFC_Branch1.withdraw(5000);
		
		h1.balancecheck();
	}
	
	

}
