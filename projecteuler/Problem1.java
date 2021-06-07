package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 18-10-2020, Sunday
 **/
public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 3; i < n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        pw.println(sum);

        pw.flush();
        pw.close();
        br.close();
    }
}