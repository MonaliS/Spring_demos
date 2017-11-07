package com.monali.src;

import com.monali.services.IAccount;

public class SavingAccount implements IAccount{

	@Override
	public void deposite() {
		System.out.println("Inside Saving account deposite method");
	}

	@Override
	public void withdraw() {
		System.out.println("Inside Saving account withdraw method");
	}

	@Override
	public void getBalance() {
		System.out.println("Inside Saving account getbalance method");
	}
	
}
