package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author : Arihant Bansal
 * Date : 20-12-2020, Sunday
 **/
public class WordCorrection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine().trim());
        String word = br.readLine().trim();
        char[] chars = word.toCharArray();
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u', 'y');

        pw.print(chars[0]);
        for (int i = 1; i < len; i++) {
            if (!vowels.contains(chars[i]) || !vowels.contains(chars[i - 1])) {
                pw.print(chars[i]);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}