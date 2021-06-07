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
public class Bachgold {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int times;

        if(n % 2 == 0) {
            times = n/2;
            pw.println(times);
            for (int i = 0; i < times - 1; i++) {
                pw.print("2 ");
            }
            pw.println("2");
        } else {
            times = (n - 3)/2;
            pw.println(times + 1);
            for (int i = 0; i < times; i++) {
                pw.print("2 ");
            }
            pw.println("3");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}