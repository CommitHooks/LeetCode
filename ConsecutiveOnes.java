
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Input: [1,1,0,1,1,1]
Output: 3

Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveOnes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1s and 0s separated by comma: ");
		
		String[] str = br.readLine().split(",");
		
		int len = str.length;
		int[] bs = new int[len];
		
		for (int i=0; i<len; i++) {
			bs[i] = Integer.parseInt(str[i]);
		}
		
		System.out.println("The maximum number of consecutive 1s is: " + findMaxConsecutiveOnes(bs));
	}
	
	static int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
        int count = 0;
        
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				result = Math.max(count, result);
			} else
				count = 0;
		}

        return result;
    }

}
