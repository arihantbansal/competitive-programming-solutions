package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().replaceAll("[+]", "");
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        String ans = new String(chars);

        ans = ans.replaceAll("", "+").replaceFirst("[+]", "");

        pw.println(ans.substring(0, ans.length() - 1));

        pw.flush();
        pw.close();
        br.close();
    }
}