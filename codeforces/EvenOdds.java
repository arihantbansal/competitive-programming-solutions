package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class EvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long odds = (n % 2 == 0) ? (n / 2) : ((n / 2) + 1);

        if (k <= odds) {
            pw.println(k * 2 - 1);
        } else {
            pw.println((k - odds) * 2);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}