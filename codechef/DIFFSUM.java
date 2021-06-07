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
public class DIFFSUM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());

        pw.println((a > b) ? (a - b) : (a + b));

        pw.flush();
        pw.close();
        br.close();
    }
}