package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author : Arihant Bansal
 * Date : 22-12-2020, Tuesday
 **/
public class ClassroomWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine().trim());
        List<Long> sols = new ArrayList<>();
        long res;
        for (long i = (n - 81 > 0) ? n - 81 : 1; i < n; i++) {
            res = i + sumOfDigits(i);
            if (res == n) {
                sols.add(i);
            }
        }

        pw.println(sols.size());
        for (Long sol : sols) {
            pw.println(sol);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static long sumOfDigits(long n) {
        long ans;
        for (ans = 0; n > 0; ans += (n % 10), n /= 10);
        return ans;
    }
}