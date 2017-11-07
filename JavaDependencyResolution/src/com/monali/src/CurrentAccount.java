package com.monali.src;

import com.monali.services.IAccount;

public class CurrentAccount implements IAccount {

	@Override
	public void deposite() {
		System.out.println("Inside Current account deposite method");
	}

	@Override
	public void withdraw() {
		System.out.println("Inside Current account withdraw method");
	}

	@Override
	public void getBalance() {
		System.out.println("Inside Current account getBalance method");

	}

}
