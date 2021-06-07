package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class FLOW005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        int n, num;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());

            num = notes(n);
            pw.println(num);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int notes(int n) {
        int count = 0, amt = n;

        int[] deno = {100, 50, 10, 5, 2, 1};
        for (int i = 0; i < deno.length; i++) {
            count += (amt / deno[i]);
            amt = amt % deno[i];
        }

        return count;
    }
}