/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalizedWord {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a string: ");
		
		String word = br.readLine();
		System.out.println("The entered word is capitalized as defined: " + detectCapitalUse(word));

	}
	
	static boolean detectCapitalUse(String word) {
        boolean cap = false;
        char first = word.charAt(0);
        
        if (word.equals(word.toUpperCase())) {
        	cap = true;
        }
        else if (word.equals(word.toLowerCase())) {
        	cap = true;
        }
        else if (Character.isUpperCase(first)) {
        	String sub = word.substring(1);
        	if (sub.equals(sub.toLowerCase())) {
        		cap = true;
        	}
        	else {
        		cap = false;
        	}
        }
        else {
        	cap = false;
        }
        
        return cap;
    }
}
