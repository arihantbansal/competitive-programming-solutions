package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 17-10-2020, Saturday
 **/
public class FCTRL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        int n, zeroes, val;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            zeroes = 0;

            for (int j = 1; (val = (int) Math.floor((double) n / Math.pow(5, j))) != 0; j++) {
                zeroes += val;
            }

            pw.println(zeroes);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}