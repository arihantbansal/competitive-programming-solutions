package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class FLOW016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        long a, b, gcd, lcm;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            gcd = gcd(a,b);
            lcm = lcm(a, b);
            pw.printf("%d %d%n", gcd, lcm);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return ((a / gcd(a, b)) * b);
    }
}