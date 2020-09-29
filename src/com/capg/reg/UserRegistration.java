package com.capg.reg;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to User Registration");
	boolean found=false;
	
	do {
	   System.out.println("Enter first name (Starts with capital)");
	            String fname = sc.nextLine();
	             Pattern p1 =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	            Matcher m1 = p1.matcher(fname);
	            boolean matchfound1 = m1.find();
	            if(matchfound1) {
		         found=true;
		       break;
	              }
	             else {
		        System.out.println("Incorrect name (Start with capital and should have min 3 charcaters ");
		                     }
	}while(!found);
	      
	      do {
	    	  found=false;
	     System.out.println("Enter last name (Starts with capital)");
	            String lname = sc.nextLine();
	            Pattern p2 =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	            Matcher m2 = p2.matcher(lname);
	            boolean matchfound2 = m2.find();
	            if(matchfound2) {
	            	
	            	found=true;
	            	break;
	            }
	            else {
	            	System.out.println("Incorrect name (Start with capital and should have min 3 charcaters ");
	            	}
	            
	      }while(!found);
	      
	      do {
	    	  found=false;
	     System.out.println("Enter valid email ");
	            String email = sc.nextLine();
	            Pattern p3 =Pattern.compile("^[a-z]([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}");
	            Matcher m3 = p3.matcher(email);
	            boolean matchfound2 = m3.find();
	            if(matchfound2) {
	            	
	            	found=true;
	            	break;
	            }
	            else {
	            	System.out.println("Incorrect email (Not in Proper Format ");
	            	}
	            
	      }while(!found);
	      
	      do {
	    	  found=false;
	     System.out.println("Enter valid Phone Number ");
	            String number = sc.nextLine();
	            Pattern p4 =Pattern.compile("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
	            Matcher m4 = p4.matcher(number);
	            boolean matchfound2 = m4.find();
	            if(matchfound2) {
	            	
	            	found=true;
	            	break;
	            }
	            else {
	            	System.out.println("Incorrect Number(Not in Proper Format ");
	            	}
	            
	      }while(!found);
	      
	      do {
	    	  found=false;
	     System.out.println("Enter valid Password(min 8 characters ");
	            String passwd = sc.nextLine();
	            Pattern p5 =Pattern.compile("[a-zA-Z]{8,}");
	            Matcher m5 = p5.matcher(passwd);
	            boolean matchfound2 = m5.find();
	            if(matchfound2) {
	            	System.out.println("Valid");
	            	found=true;
	            	break;
	            }
	            else {
	            	System.out.println("Invalid psswd (Not in Proper Format) ");
	            	}
	            
	      }while(!found);
}
}
