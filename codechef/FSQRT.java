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
public class FSQRT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int t = Integer.parseInt(line);

        for(int i = 0; i < t; i++) {
            pw.println(Math.round(Math.sqrt(Integer.parseInt(br.readLine()))));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}