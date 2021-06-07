package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 22-10-2020, Thursday
 **/
public class ALCATRAZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        String num;
        int sum;

        for (int i = 0; i < t; i++) {
            num = br.readLine().trim();
            sum = 0;

            for (int j = 0; j < num.length(); j++) {
                sum += (num.charAt(j) - '0');
            }

            pw.println(sum);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}