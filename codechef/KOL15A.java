package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class KOL15A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());

        String line;
        int sum;
        for (int i = 0; i < t; i++) {
            line = br.readLine().trim().replaceAll("[^0-9]", "");
            sum = 0;

            for (int j = 0; j < line.length(); j++) {
                sum += Integer.parseInt(String.valueOf(line.charAt(j)));
            }

            pw.println(sum);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}