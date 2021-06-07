package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 31-10-2020, Saturday
 **/
public class ANDOR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine().trim());

        long x;
        for (int i = 0; i < t; i++) {
            x = Long.parseLong(br.readLine().trim());

            pw.printf("%d %d%n", x, 0); // or (x-1, 1)
        }

        pw.flush();
        pw.close();
        br.close();
    }
}