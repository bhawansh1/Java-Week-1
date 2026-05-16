package com.bank.model;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;

public class StudentAccount extends SavingsAccount {

	private static final long serialVersionUID = 1L;
String  institutionName;

public StudentAccount(String name, double balance ,String  institutionName) {
	super(name, balance, 20000);
	min_balance=100;
	this.institutionName=institutionName;
}



}
