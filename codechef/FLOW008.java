package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 08-10-2020, Thursday
 **/
public class FLOW008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            pw.println((Integer.parseInt(br.readLine().trim()) < 10) ? ("Thanks for helping Chef!") : "-1");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}