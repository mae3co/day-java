package algorithm;

import java.io.*;

public class Alphabet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine().toLowerCase();

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            arr[c - 97]++;

        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char)(i+97) + ":" + arr[i] + " ");
        }
    }
}
