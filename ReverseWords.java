/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class ReverseWords {

    public static String reverseWords (String str) {
        String reWords = "";
        String[] words = str.split(" ");
        int numOfWords = words.length;

        StringBuffer[] sb = new StringBuffer[numOfWords];

        for (int i=0; i<numOfWords; i++) {
            sb[i] = (new StringBuffer(words[i])).reverse();
            reWords = reWords + " " + sb[i].toString();
        }

        return reWords;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of words: ");

        String str = br.readLine();
        System.out.println ("The reversed words; " + reverseWords(str));
    }
}
