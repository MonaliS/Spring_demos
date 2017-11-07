package com.monali.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.monali.services.IATM;

public class ATMProcessor {
	public static void main(String []args){
		IATM atm=null;
		String accountType="";
		System.out.println("Enter Account type (Saving/Current):");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try {
			accountType=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(accountType.equalsIgnoreCase("saving")){
			atm=new ATM(new SavingAccount());
		}
		else {
			atm=new ATM(new CurrentAccount());
		}
		atm.processDeposite();
		atm.processWithdraw();
		atm.processGetBalance();
	}
}
