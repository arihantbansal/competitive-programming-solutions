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
public class LUCKFOUR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String s;

        for(int i = 0; i < t; i++) {
            s = br.readLine();
            pw.println(s.length() - s.replaceAll("4", "").length());
        }

        pw.flush();
        pw.close();
        br.close();
    }
}