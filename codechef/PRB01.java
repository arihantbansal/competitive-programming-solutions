package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 12-10-2020, Monday
 **/
public class PRB01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int num;

        for (int i = 0; i < t; i++) {
            num = Integer.parseInt(br.readLine());
            pw.println((isPrime(num)) ? "yes" : "no");
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        else if(n == 2 || n == 3) return true;
        else if(n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i < Math.sqrt(n) + 1; i += 6) {
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}