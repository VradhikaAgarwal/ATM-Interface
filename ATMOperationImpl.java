package com.atm;

import java.util.*;
public class ATMOperationImpl implements ATMOperationInterface {
     ATM atm=new ATM();
     Map<Double,String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: " +atm.getBalance()+"\n");		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			ministmt.put(withdrawAmount, "Amount Withdrawn");
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("Collect the Cash " +withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance..!! \n");
			}
		}
		else {
			System.out.println("Please Enter the Amount in Multiple of 500 \n");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount,"Amount Deposited");
		System.out.println(depositAmount+" Deposited Successfully !! \n");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String>m:ministmt.entrySet())	{
			System.out.println(m.getKey()+" "+m.getValue()+"\n");
		}
	}

}
