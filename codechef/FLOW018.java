package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 08-10-2020, Thursday
 **/
public class FLOW018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            pw.println(factorial(Integer.parseInt(br.readLine().trim())));
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static long factorial(int n) {
        if(n == 1) { return 1; }
        return n * factorial(n - 1);
    }
}