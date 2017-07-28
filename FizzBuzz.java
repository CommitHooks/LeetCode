
/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output â€œFizzâ€� instead of the number and for the multiples of five output â€œBuzzâ€�. For numbers which are multiples of both three and five output â€œFizzBuzzâ€�.

Example: n = 15
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> countToN(int n) {
		List<String> myList = new ArrayList<String>(n);

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					myList.add("FizzBuzz");
				} else {
					myList.add("Fizz");
				}
			} else if (i % 5 == 0) {
				myList.add("Buzz");
			} else {
				myList.add(Integer.toString(i));
			}
		}
		return myList;
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("Usage: java FizzBuzz <n>");
		}

		int n = Integer.parseInt(args[0]);
		System.out.println("n: " + n);
		System.out.println(countToN(n));
	}
}
