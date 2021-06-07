package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 04-11-2020, Wednesday
 **/
public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine().trim());

        while(n != 1) {
            pw.printf("%d ", n);
            if (n % 2 == 0) n /= 2;
            else n = (n * 3) + 1;
        }

        pw.print(1);

        pw.flush();
        pw.close();
        br.close();
    }
}