package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 05-11-2020, Thursday
 **/
public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        pw.println(solve(n));

        pw.flush();
        pw.close();
        br.close();
    }


    public static String solve(int n) {
        StringBuilder sb = new StringBuilder();

        if(n == 1) return "1";
        if (n < 4) return "NO SOLUTION";
        if(n == 4) return "2 4 1 3";

        for (int i = (n % 2 == 0) ? (n) : (n - 1); i > 0; i -= 2) {
            sb.append(i + " ");
        }

        for (int i = (n % 2 == 1) ? (n) : (n - 1); i > 0; i -= 2) {
            sb.append(i + " ");
        }

        return sb.toString().trim();
    }
}