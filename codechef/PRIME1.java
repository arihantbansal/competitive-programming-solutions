package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class PRIME1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        long beg, end;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            beg = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            for (long j = beg; j <= end; j++) {
                if (isPrime(j)) pw.println(j);
            }
            pw.println("");
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2  == 0 || num % 3 == 0) return false;

        for (long i = 6L; i <= (long) Math.sqrt(num) + 1; i += 6) {
            if ((num % (i - 1) == 0) || (num % (i + 1) == 0)) return false;
        }

        return true;
    }
}