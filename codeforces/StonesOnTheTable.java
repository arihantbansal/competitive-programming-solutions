package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class StonesOnTheTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        String stones = br.readLine().trim();
        int consec = 0, count = 0;
        char c, prev;
        for (int i = 1; i < n; i++) {
            prev = stones.charAt(i - 1);
            c = stones.charAt(i);
            if(prev == c) {
                consec++;
            } else {
                if(consec > 0) {
                    count += consec;
                }
                consec = 0;
            }
        }

        if(consec > 0) {
            count += consec;
        }

        pw.println(count);


        pw.flush();
        pw.close();
        br.close();
    }
}