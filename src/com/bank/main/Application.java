package com.bank.main;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;

import java.awt.EventQueue;

import com.bank.ui.GUIForm;

public class Application {
	public static void main(String[] args) 
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						GUIForm.login.frame.setVisible(true);
					} catch (Exception e) {
						
					}
				}
			});
		}
}
