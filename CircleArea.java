package com.codegnanassignment;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//first problem
		/*int r=sc.nextInt();
		double s=3.14*(r*r);
		System.out.println(s);*/
		
		//Second problem
		/*
		System.out.println("Enter the principal amount:");
		double principle = sc.nextInt();
		
		System.out.println("Enter the rate of interest % :");
		double rate = sc.nextInt();
		
		System.out.println("Enter time in years:" );
		double time = sc.nextInt();
		
		/*double SimpleInterest =(principle*rate*time)/100;
		double TotalAmount = principle+SimpleInterest;
		
		double CompoundInterest =TotalAmount - principle;
		System.out.println("CompoundInterest+TotalAmount:"+CompoundInterest);*/
		
		//Thirdproblem
		
		/* TotalAmount = principle*(1 + rate/100)*time;
		double CompoundInterest = TotalAmount - principle;
		System.out.println("CompoundInterest+TotalAmount:"+CompoundInterest);*/
		
		//Fifth problem
		
		/*double SimpleInterest = (principle*rate*time)/100;
		double compoundInterest = principle * (1 + rate/100)*time-principle;
	    System.out.println("CompoundInterest+TotalAmount:"+compoundInterest);*/
		
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the RollNumber");
		int RollNumber = sc.nextInt();
		
		System.out.println("Enter the Age");
		int Age = sc.nextInt();
		
		System.out.println("Enter the grade");
		String grade = sc.next();
		
		System.out.println("\n--- Student Details ----");
		System.out.println("Name : "+ name);
		System.out.println("RollNumber : "+ RollNumber);
		System.out.println("Age: "+ Age); 
		System.out.println("Grade:"+ grade);
		
	}
}

