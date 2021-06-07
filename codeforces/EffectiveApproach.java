package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 25-10-2020, Sunday
 **/
public class EffectiveApproach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());

        int[] nums = new int[n];
        int[] pos = new int[n];
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            pos[nums[i] - 1] = i + 1;
        }

        int m = Integer.parseInt(br.readLine().trim()), b;
        long vasya = 0, petya = 0;
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < m; i++) {
            b = Integer.parseInt(st.nextToken());
            vasya += pos[b - 1];
            petya += ((n + 1) - pos[b - 1]);
        }

        pw.printf("%d %d%n", vasya, petya);

        pw.flush();
        pw.close();
        br.close();
    }
}