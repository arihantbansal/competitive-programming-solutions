package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 17-10-2020, Saturday
 **/
public class TEST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        while(n != 42) {
            pw.println(n);
            n = Integer.parseInt(br.readLine().trim());
        }

        pw.flush();
        pw.close();
        br.close();
    }
}