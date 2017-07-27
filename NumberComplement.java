/* Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberComplement {

    public static int bitSwap(int x) {
        int y = x;

        String xb = Integer.toBinaryString(x);
        System.out.println("The binary value of the input is: " + xb);

        int len = xb.length();
        StringBuffer yb = new StringBuffer(xb);

        for (int i = 0; i < len; i++) {
            if (xb.charAt(i) == '0') {
                yb.setCharAt(i, '1');
            }
            else if (xb.charAt(i) == '1') {
                yb.setCharAt(i, '0');
            }
        }

        System.out.println("The swapped binary value is: " + yb.toString());
        y = Integer.parseInt(yb.toString(), 2);

        return y;
    }

    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a random integer: ");

        String xb = br.readLine();
        int x = Integer.parseInt(xb);

        System.out.println("The swapped integer value is: " + bitSwap(x));
    }

}
