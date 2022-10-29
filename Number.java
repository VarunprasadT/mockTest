package com.xworkz.test;

public class Number {
	static int num = 1234;
	static int reverse = 0; 
		static int	lastDigit;
		static int factorial=1;
		static int sum;
	public static void reverse() {
		 
		for(;num>0;num=num/10){
			lastDigit = num%10;
			reverse=reverse*10+lastDigit;
		}
		System.out.println(reverse);
	}
	
	public static void fac(int number) {
	
		for(int i=1;i<=number;i++){  
		      factorial=factorial*i;
	}
		System.out.println(factorial);
	}
	public static void add() {
		for(int n=234;n>0;n=n/10){
			lastDigit = n%10;
			sum =sum+lastDigit;
	}
		System.out.println(sum);
	}
public static void main(String[] args) {
	reverse();
	fac(8);
	add();
}	
}

