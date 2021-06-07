package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Author : Arihant Bansal
 * Date : 24-10-2020, Saturday
 **/
public class ChatRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().trim().replaceAll("[^helo]", "");

        char[] chars = line.toCharArray();

        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : charSet) {
            sb.append(c);
        }

        pw.println((sb.toString().equalsIgnoreCase("helo") && line.replaceAll("[^l]", "").length() > 1) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}