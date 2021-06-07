package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class UltraFastMathematician {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String one = br.readLine(), two = br.readLine();
        char[] first = one.toCharArray(), second = two.toCharArray();
        int len = first.length;
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append((first[i] != second[i]) ? "1" : "0");
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}