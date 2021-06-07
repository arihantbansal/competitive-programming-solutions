package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 04-11-2020, Wednesday
 **/
public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().trim();
        int count = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }

        pw.println(Math.max(count, max));


        pw.flush();
        pw.close();
        br.close();
    }
}