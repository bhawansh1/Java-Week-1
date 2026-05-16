package com.bank.model;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;
import java.io.Serializable;
import com.bank.exception.InvalidAmount;
import com.bank.exception.MaxBalance;
import com.bank.exception.MaxWithdraw;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private double balance;
	protected double min_balance;
	private String acc_num;
	
	public BankAccount(String name, double balance, double min_balance) {
        this.name = name;
        this.balance = balance;
        this.min_balance = min_balance;
        this.acc_num = 10000 + (int) (Math.random() * 89999) + "";
    }

	public void deposit(double amount) throws InvalidAmount
	{
		if (amount <= 0){
			throw new InvalidAmount("Deposit amount must be greater than zero.");
		}
		balance+=amount;
	}
	
	public void withdraw(double amount) throws MaxWithdraw, MaxBalance
	{
		if((balance-amount)>=min_balance && amount<balance)
		{
			balance-=amount;
		}
		else
		{
			throw new MaxBalance("Insufficient Balance");
		}
	}
	
	public double getbalance()
	{
		return balance;
	}

    public String getAccNum() {
        return acc_num;
    }
	
	@Override
	public String toString() {
		return "Name: " + name + ", Id: " + acc_num + ", Balance: " + balance + " Type: " + this.getClass().getSimpleName();
	}
}
