package com.xworkz.test;

public class Array {
	static int n[] = {23,45,67,8,12,3,5,7,9,102,34,4,5};
	static int countEven = 0;
	static int countOdd = 0;

	public static void primeCount() {
		int primeCount=0;
		boolean prime=true;
		for(int i =0; i<n.length;i++) {
			for(int j =2; j<=(n[i]/2);j++) {
				if(n[i]%j==0) {
				prime = false;
					break;
				}
				else {
				prime = true;
				}
			}
			if(prime==true) {
				primeCount++;
			}
		}
		System.out.println("Number of Prime Numbers in an Array is : "+primeCount);
	}
	public static void evenAndOdd() {
		for (int i = 0; i < n.length; i++) {
			if(n[i]%2==0) {
				countEven++;
				System.out.println(n[i]+" The number is Even");
			}
			else {
				countOdd++;
				System.out.println(n[i]+" The Number is Odd");
			}
		}
		System.out.println("The count of Even and Odd Number are : "+countEven+" and "+countOdd);
	}
public static void main(String[] args) {
	primeCount();
	evenAndOdd();
	System.out.println("Array size :"+n.length);
}
}
