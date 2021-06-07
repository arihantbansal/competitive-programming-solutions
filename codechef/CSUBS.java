package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 18-10-2020, Sunday
 **/
public class CSUBS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        long t = Integer.parseInt(br.readLine().trim());
        long n, len;
        String line;

        for (long i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            line = br.readLine().trim().replaceAll("0", "");
            len = line.length();
            pw.println(((len) * (len + 1)) / 2);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}