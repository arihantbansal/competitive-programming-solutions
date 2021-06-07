package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 19-12-2020, Saturday
 **/
public class KeyRaces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int s = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken()), v2 = Integer.parseInt(st.nextToken());
        int t1 = Integer.parseInt(st.nextToken()), t2 = Integer.parseInt(st.nextToken());

        long first = s * v1 + 2 * t1;
        long second = s * v2 + 2 * t2;

        pw.println((first == second) ? "Friendship" : ((first < second) ? "First" : "Second"));

        pw.flush();
        pw.close();
        br.close();
    }
}