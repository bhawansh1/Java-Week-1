package com.bank.model;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;

public class CurrentAccount extends BankAccount {

	private static final long serialVersionUID = 1L;
	String tradeLicenseNumber;

	public CurrentAccount(String name, double balance, String tradeLicenseNumber) {
		super(name, balance, 5000);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	
}
