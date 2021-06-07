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
public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean canBeSplit = false;

        for(int i = 2; i <= Math.ceil(n / 2); i += 2) {
            for(int j = (n % 2 == 0) ? (n - 2) : (n - 1); j >= Math.ceil(n / 2); j -= 2) {
                if((i + j) == n) {
                    canBeSplit = true;
                }
            }
        }

        pw.println((canBeSplit) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}