package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class SNCKYEAR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int year;
        for (int i = 0; i < n; i++) {
            year = Integer.parseInt(br.readLine());
            pw.println((year == 2010 || year == 2015 || year == 2016 || year == 2017 || year == 2019) ? "HOSTED" : "NOT HOSTED");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}