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
public class DimaAndFriends {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine().trim());
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Integer.parseInt(st.nextToken());
        }

        int ways = 0;

        for (int i = 1; i <= 5; i++) {
            if ((count + i) % (n + 1) != 1) ways++;
        }

        pw.println(ways);

        pw.flush();
        pw.close();
        br.close();
    }
}