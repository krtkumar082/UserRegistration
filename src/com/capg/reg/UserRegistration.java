package com.capg.reg;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to User Registration");
	System.out.println("Enter first name (Starts with capital)");
	String fname = sc.nextLine();
	Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	Matcher matcher = pattern.matcher(fname);
	boolean matchfound = matcher.find();
	if(matchfound) {
		System.out.println("Match found");
	}
	else {
		System.out.println("Incorrect name (Start with capital and should have min 3 charcaters ");
		
	
	}
	sc.close();
}
}
