/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

American keyboard
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardRows {
    static final char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
    static final char[] row2 = {'a','s','d','f','g','h','j','k','l'};
    static final char[] row3 = {'z','x','c','v','b','n','m'};

    static final int NUM_ROWS = 3;
    static String[] str = new String[NUM_ROWS];

    public static void main(String[] args) throws IOException {

        str[0] = String.valueOf(row1).toLowerCase();
        str[1] = String.valueOf(row2).toLowerCase();
        str[2] = String.valueOf(row3).toLowerCase();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of words separated by comma: ");

        String[] input = br.readLine().split(",");
        findWords(input);
    }

    public static boolean containChars(String keyRow, String s) {
        int len = s.length();
        boolean in = true;

        for (int i=0; i<len; i++) {
            if (keyRow.contains(s.substring(i,i+1))) {
                in = true;
            }
            else {
                in = false;
                break;
            }
        }
        return in;
    }

    public static String[] findWords(String[] words) {
        int numOfWords = words.length;
        String[] output = new String[numOfWords];

        String[] rowStr = new String[numOfWords];
        boolean[] in = new boolean[NUM_ROWS];

        for (int i=0; i<numOfWords; i++) {
            words[i] = words[i].trim();
            rowStr[i] = words[i].toLowerCase();
            //System.out.println("Input String: " + rowStr[i]);

            in[0] = containChars(str[0], rowStr[i]);
            in[1] = containChars(str[1], rowStr[i]);
            in[2] = containChars(str[2], rowStr[i]);

            if (in[0] || in[1] || in[2]) {
                output[i] = words[i];
                //System.out.println("Word that can be typed using one row of the keyboard: " + output[i]);
            }
            else {
                output[i] = "";
            }
        }

        System.out.println("Word that can be typed using one row of the keyboard:");
        for (int i=0; i<output.length; i++) {
            if (output[i] != "") {
                System.out.print(output[i] + " ");
            }
        }
        return output;
    }
}
