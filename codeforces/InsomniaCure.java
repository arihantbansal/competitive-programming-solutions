package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class InsomniaCure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine().trim());
        int l = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());
        int n =  Integer.parseInt(br.readLine().trim());
        int d = Integer.parseInt(br.readLine().trim());

        int count = 0;

        for (int i = 0; i < d; i++) {
            if((i + 1) % k == 0 || (i + 1) % l == 0 || (i + 1) % m == 0 || (i + 1) % n == 0) {
                count++;
            }
        }

        pw.println(count);

        pw.flush();
        pw.close();
        br.close();
    }
}