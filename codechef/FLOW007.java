package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 07-10-2020, Wednesday
 **/
public class FLOW007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int t = Integer.parseInt(line);

        for(int i = 0; i < t; i++) {
            line = br.readLine();
            pw.println(new StringBuilder(line).reverse().toString().replaceFirst("^0*", ""));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}