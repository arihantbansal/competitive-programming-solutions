package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 07-10-2020, Wednesday
 **/
public class MUFFINS3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        int n;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            pw.println((int) (n / 2 + 1));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}