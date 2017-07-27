/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	
	public static String reverseWord(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reWord = sb.reverse().toString();
		
		return reWord;
	}
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a word: ");
		String word = br.readLine();
		 if (word != null) {
			 System.out.println ("The reversed word is: " + reverseWord(word));
		 }
	}
}