/*
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
*/

import java.io.*;
import java.util.*;

public class ArrayPartition{
	
	public static final int NUM_PARA = 2;

	public static int arrayPairSum(int[] nums) {
		int len = nums.length;
		int sum = 0;
		
		if ((len % 2) == 0)
		{
			int max;
			int j = 0;
			
			Arrays.sort(nums);
			
			for ( int i = 0 ; i < nums.length ; i++ ) {
            System.out.println(nums[i]);
        }
			
			// Adding up the first number of each pair
			for (int i=0; i < len; i++) {
				if (i%2 == 0) {
					sum = sum + nums[i];
				}
			}
		}
		else {
			System.out.println("Please enter even number of numbers.");	
			return -1;
		}
		
		return sum;
	}
	
	public static void main(final String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numbers separated by comma : ");
		
		String input = br.readLine();
		String[] strInput = input.split(",");
		int[] numInput = new int[strInput.length];
		
		for (int i=0; i < strInput.length; i++) {
			numInput[i] = Integer.parseInt(strInput[i]);
		}
		
		int sum = arrayPairSum(numInput);
		System.out.println("The array partition sum is: " + sum);
	}
}