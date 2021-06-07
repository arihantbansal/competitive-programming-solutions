package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class AMR15A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int even = 0, odd = 0, curr;

        for (int i = 0; i < n; i++) {
            curr = Integer.parseInt(st.nextToken());
            if(curr % 2 == 0) even++;
            else odd++;
        }

        pw.println((even > odd) ? "READY FOR BATTLE" : "NOT READY");

        pw.flush();
        pw.close();
        br.close();
    }
}