package com.murali.classLevelLockThread;

public class HDFC_Branch2 {
long account;
 static double balance;


public HDFC_Branch2(long account, double balance) {
	super();
	this.account = account;
	this.balance = balance;
}
public long getAccount() {
	return account;
}
public void setAccount(long account) {
	this.account = account;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public static synchronized void withdraw(double amount) {
	balance = balance - amount;
}

public static synchronized void deposit(double amount) {
	balance = balance + amount;
}
}
