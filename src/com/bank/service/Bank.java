package com.bank.service;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;
import java.io.Serializable;
import javax.swing.DefaultListModel;
import com.bank.exception.AccNotFound;
import com.bank.exception.InvalidAmount;
import com.bank.exception.MaxBalance;
import com.bank.exception.MaxWithdraw;
import com.bank.model.*;

public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;
	private BankAccount[] accounts= new BankAccount[100];
	public int addAccount(BankAccount acc)
	{
		int i=0;
		for(i=0;i<100;i++)
		{
			if(getAccounts()[i]==null)
			{
				break;
			}
		}
		getAccounts()[i]=acc;
		return i;
	}
	
	public int addAccount(String name, double balance, double maxWithLimit )
	{
		SavingsAccount acc=new SavingsAccount(name, balance, maxWithLimit);
		return this.addAccount(acc);
	}
	
	public int addAccount(String name, double balance, String tradeLicense)
	{
		CurrentAccount acc = new CurrentAccount(name, balance,tradeLicense);
		return this.addAccount(acc);
	}
	
	public int addAccount(String name, String  institutionName, double balance, double min_balance)
	{
		StudentAccount acc= new StudentAccount(name,balance,institutionName);
		return this.addAccount(acc);
	}
	
	public BankAccount findAccount(String aacountNum)
	{
		int i;
		for(i=0;i<100;i++)
		{
			if(getAccounts()[i]==null)
			{
				break;
			}
			if(getAccounts()[i].getAccNum().equals(aacountNum))
			{
				return getAccounts()[i];
			}
		}
		return null;
	}
	
	public void deposit(String aacountNum, double amt) throws InvalidAmount,AccNotFound
	{
		if(amt<0)
		{
			throw new InvalidAmount("Invalid Deposit amount");
		}
		BankAccount temp=findAccount(aacountNum);
		if(temp==null)
		{
			throw new AccNotFound("Account Not Found");
		}
		temp.deposit(amt);
	}
	
	public void withdraw(String aacountNum, double amt) throws MaxBalance,AccNotFound, MaxWithdraw, InvalidAmount
	{
		BankAccount temp=findAccount(aacountNum);
		if(temp==null)
		{
			throw new AccNotFound("Account Not Found");
		}
		if(amt<=0)
		{
			throw new InvalidAmount("Invalid Amount");
		}
		if(amt>temp.getbalance())
		{
			throw new MaxBalance("Insufficient Balance");
		}
		temp.withdraw(amt);
	}
	
	public DefaultListModel<String> display()
	{
		DefaultListModel<String> list=new DefaultListModel<String>();
		int i;
		for(i=0;i<100;i++)
		{
			if(getAccounts()[i]==null)
			{
				break;
			}
			list.addElement(getAccounts()[i].toString());
		}
		return list;
	}

	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}
}
