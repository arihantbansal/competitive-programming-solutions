package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class PALL01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        String num;
        StringBuilder sb;

        for (int i = 0; i < t; i++) {
            num = br.readLine().trim();
            sb = new StringBuilder();

            sb.append(num).reverse();
            pw.println((num.equals(sb.toString())) ? "wins" : "loses");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}