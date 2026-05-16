package com.bank.model;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;
import com.bank.exception.MaxBalance;
import com.bank.exception.MaxWithdraw;

public class SavingsAccount extends BankAccount {
	private static final long serialVersionUID = 1L;
	float rate= .05f;
	double maxWithLimit;
	
	public SavingsAccount(String name, double balance,double maxWithLimit) {
		super(name, balance, 2000);
		this.maxWithLimit= maxWithLimit;
	}
	
	public double getNetBalance()
	{
		double NetBalance= getbalance()+(getbalance()*rate);
		return NetBalance;
	}
	
	public void withdraw(double amount) throws MaxWithdraw, MaxBalance
	{
		if(amount<maxWithLimit)
		{
			super.withdraw(amount);
			
		}
		else
		{
			throw new MaxWithdraw("Maximum Withdraw Limit Exceed");
		}
		
	}
	
	
}
