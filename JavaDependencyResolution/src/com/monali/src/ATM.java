package com.monali.src;

import com.monali.services.IATM;
import com.monali.services.IAccount;

public class ATM implements IATM{

	IAccount account=null;
	public ATM(IAccount account){
		this.account=account;
	}
	@Override
	public void processDeposite() {
		System.out.println("Inside process deposite");
		account.deposite();
	}

	@Override
	public void processWithdraw() {
		System.out.println("Inside process withdraw");
		account.withdraw();
	}

	@Override
	public void processGetBalance() {
		System.out.println("Inside process getBalance");
		account.getBalance();
	}

}
