package com.murali.classLevelLockThread;

public class ThreadOperation {
public static void main(String[] args) {

	HDFC_Branch1.balance = 10000;
	HDFC_Branch2.balance = 10000;
	
	HDFC_Branch1 h1 = new HDFC_Branch1(33333,90000);
	
	ATMClass atm = new ATMClass(h1);
	GPay gpay =new GPay(h1);
		
	atm.start();  // 20000 - 10000
	gpay.start(); // 20000 + 50000
	
	
	System.out.println(HDFC_Branch1.balance);
	//System.out.println(HDFC_Branch2.balance);
	
}
}
