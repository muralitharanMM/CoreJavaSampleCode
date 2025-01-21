package com.murali.classLevelLockThread;

public class GPay extends Thread {
	
	HDFC_Branch1 h1;
	
	
public GPay(HDFC_Branch1 h1) {
		super();
		this.h1 = h1;
	}


@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	HDFC_Branch1.withdraw(4000);
	h1.balancecheck();
}
}
