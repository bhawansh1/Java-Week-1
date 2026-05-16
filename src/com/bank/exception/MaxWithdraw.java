package com.bank.exception;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;

public class MaxWithdraw extends Exception {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaxWithdraw(String s)
	{
		super(s);
	}

}
