package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-12-2020, Sunday
 **/
public class SaveEnergy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int k = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());

        double time = 0;

        pw.flush();
        pw.close();
        br.close();
    }
}