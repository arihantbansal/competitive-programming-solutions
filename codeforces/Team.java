package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int prob = 0;
        String s;

        for (int i = 0; i < n; i++) {
            s = br.readLine().replaceAll(" ", "").replaceAll("0", "");
            if(s.length() >= 2) {
                prob++;
            }
        }

        pw.println(prob);

        pw.flush();
        pw.close();
        br.close();
    }
}