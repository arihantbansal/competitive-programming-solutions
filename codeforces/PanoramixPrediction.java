package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class PanoramixPrediction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken()), second = Integer.parseInt(st.nextToken());

        pw.println((nextPrime(first) == second) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }

    public static int nextPrime(int prime) {
        int next = prime + 1;
        boolean flag = false;
        outer:
        while(!checkPrime(next)) {
            next++;
        }
        return next;
    }

    public static boolean checkPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < (num / 2) + 1; i++) {
            if(num % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}