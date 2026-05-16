package com.bank.util;
import com.bank.model.*;
import com.bank.service.*;
import com.bank.exception.*;
import com.bank.ui.*;
import com.bank.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bank.model.*;

public class FileIO {
	
	
public static Bank bank=null;


	public static void Read()
	{
//		Bank bank =null;
		FileInputStream fis =null;
		ObjectInputStream oin=null;
		try {
			fis =new FileInputStream("data");
			oin=new ObjectInputStream(fis);
			FileIO.bank=(Bank)oin.readObject();
			}
			
		catch (Exception en) {
			FileIO.bank=new Bank();
				}
		
		finally{
			try{
				if(oin!=null) oin.close();
			if(fis!=null) fis.close();
			}
			catch (IOException en) {
					}
			
		}
		//return bank;
	}
	
	public static void Write()
	{
		try {
			FileOutputStream fout=new FileOutputStream("data");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(FileIO.bank);
			out.flush();
			fout.close();
			}
			catch(Exception en)
			{
				
			}
	}
}
