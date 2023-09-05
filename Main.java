package com.atm;
import java.util.*;
public class Main {
  public static void main(String[] args) {
	  ATMOperationInterface op=new ATMOperationImpl();
	int atmNumber=12345;
	int atmPin=1234;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to ATM machine..!!!");
	System.out.println("Enter ATM number: ");
	int atmno=sc.nextInt();
	System.out.println("Enter ATM pin Number: ");
	int atmpin=sc.nextInt();
	if((atmNumber==atmno)&&(atmPin==atmpin)) {
		System.out.println("Validation done");
		while(true) {
			System.out.println("1. View Available Balance\n2. WithDraw Amount\n3. Deposit Amount\n4. View MiniStatement\n5. Exit");
		    System.out.println("Enter your choice : ");
		    int ch=sc.nextInt();
		    if(ch==1) {
		     op.viewBalance();
		    }
		    else if(ch==2) {
		    	System.out.println("Enter the amount to withdraw: ");
		    	double withdrawAmount=sc.nextDouble();
		    	op.withdrawAmount(withdrawAmount);
		    	
		    }
		    else if(ch==3) {
		    	System.out.println("Enter Amount to Deposit:  ");
		    	double depositAmount= sc.nextDouble();
		    	op.depositAmount(depositAmount);
		    	
		    }
		    else if(ch==4) {
		    	op.viewMiniStatement();
		    }
		    else if(ch==5) {
		    	System.out.println("Please Collect your ATM card\nThank You for Visiting");
		    	System.exit(0);
		    }
		    else {
		    	System.out.println("Please Enter correct choice..!!");
		    }
		}
	}
	else
		System.out.println("Incorrect ATM Number or Pin");
	    System.exit(0);
}
}
