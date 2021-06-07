package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 23-10-2020, Friday
 **/
public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine().trim());

        long max = 1;

        for (long i = 2; i * i <= n;) {
            if (n % i == 0) {
                n /= i;
                max = i;
            } else {
                i++;
            }
        }

        if(n > max) max = n;

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}