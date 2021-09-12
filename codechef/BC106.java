package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class BC106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        BigInteger sum = new BigInteger("0");

        int n = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            sum = sum.add(new BigInteger(st.nextToken()));
        }

        pw.println(sum.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}