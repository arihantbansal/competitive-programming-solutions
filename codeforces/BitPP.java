package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 12-10-2020, Monday
 **/
public class BitPP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        String s;

        for (int i = 0; i < n; i++) {
            s = br.readLine().replaceAll("[X]", "");
            if(s.equals("++")) {
                x++;
            } else {
                x--;
            }
        }

        pw.println(x);

        pw.flush();
        pw.close();
        br.close();
    }
}