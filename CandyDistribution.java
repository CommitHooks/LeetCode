/*
Given an integer array with even length, where different numbers in this array
represent different kinds of candies. Each number means one candy of the corresponding kind.
You need to distribute these candies equally in number to brother and sister.
Return the maximum number of kinds of candies the sister could gain.

Example 1:
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
The sister has three different kinds of candies.
Example 2:
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
The sister has two different kinds of candies, the brother has only one kind of candies.
Note:

The length of the given array is in range [2, 10,000], and will be even.
The number in given array is in range [-100,000, 100,000].
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CandyDistribution {

    public static int distributeCandies(int[] candies) {
        int numOfCandies = candies.length;
        int half = numOfCandies / 2;

        if (numOfCandies % 2 == 1) {
            System.out.println("Please enter even number of candies.");
            return -1;
        }
        else {
            //Remove the duplicate from the candies
            //Use LinkedHashSet if you want insertion order
            Set<Integer> set = new HashSet<Integer>();

            for (int i = 0; i < numOfCandies; i++) {
                set.add(candies[i]);
            }

            Object[] sister = set.toArray();

            if (sister.length <= half) {
                return sister.length;
            }
            else {
                return half;
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter even number of integers separated by comma: ");

        String str = br.readLine();
        String[] candies = str.split(",");
        int[] candy = new int[candies.length];

        for (int i=0; i<candy.length; i++) {
            candy[i] = Integer.parseInt(candies[i]);
            // use Character.getNumericValue for char
        }

        int sisCandy = distributeCandies(candy);
        System.out.println("The max number of kinds of candies the sister could gain: " + sisCandy);
    }
}
