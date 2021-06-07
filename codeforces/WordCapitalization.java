package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class WordCapitalization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        char first = word.charAt(0);

        pw.printf(Character.toUpperCase(first) + word.substring(1));

        pw.flush();
        pw.close();
        br.close();
    }
}