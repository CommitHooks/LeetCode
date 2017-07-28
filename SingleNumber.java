/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleNumber {
	 
	static int findNumber(int[] a) {
		
		int num = 0;
		
		for (int i=0; i<a.length; i++) {
			num ^= a[i]; 
			//Note: XOR works binary-wise (convert the int to binary then like 1 ^ 1 = 0, 1 ^ 0 = 1
		}
		
		return num;
	}
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter a list of int separated by comma (Make sure every element appears twice except for one): ");
		String[] str = br.readLine().split(",");
		
		int len = str.length;
		int[] num = new int[len];
		
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		System.out.println("The Single Number is :" + findNumber(num));
	}
}