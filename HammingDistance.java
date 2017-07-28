/* Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ?   ?
The above arrows point to positions where the corresponding bits are different.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingDistance {
	
	public static final int NUM_PARA = 2;

	public static int hammingDistance(int x, int y) {
		
		int distance = 0;
		
		if (x >= 0 && y < 231) {
			
			String xb = Integer.toBinaryString(x);
			String yb = Integer.toBinaryString(y);
					
			int numDigits = xb.length();
			if (xb.length() < yb.length()) {
				numDigits = yb.length();
				
				while (xb.length() < numDigits) {
					xb = '0' + xb;
				}
			}
			else {
				while (yb.length() < numDigits) {
					yb = '0' + yb;
				}
			}
			
			System.out.println("x = " + xb);
			System.out.println("y = " + yb);
			
			int i = 0;
			while (i < xb.length() ) {
				if (Character.getNumericValue(xb.charAt(i)) != Character.getNumericValue(yb.charAt(i))) {
					distance++;
				}
				i++;
			}
		}
		
		else {
			System.out.println("Please make sure x >= 0 and y < 231.");	
			return -1;
		}
		
		return distance;
	}
	
	public static void main(final String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers below (one number per row): ");

		int num = 0;
		int[] array = new int[NUM_PARA];
		while (num < NUM_PARA) {
			System.out.print("> ");
			array[num] = Integer.parseInt(br.readLine());
			num++;
		}
		
		int hamDis = hammingDistance(array[0], array[1]);
		System.out.println("The Hamming Distance between " + array[0] + " and " + array[1] + " is: " + hamDis);
	}
}