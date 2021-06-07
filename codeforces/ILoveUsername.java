package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class ILoveUsername {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[n];
        int count = 0;
        boolean dec = false, inc = false;

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if(scores[0] > scores[i]) { dec = true; }
            else if(scores[0] < scores[i]) { inc = true; }

            for (int j = 0; j < i; j++) {
                if(dec) {
                    if(scores[j] <= scores[i]) { dec = false; }
                } else if(inc) {
                    if(scores[j] >= scores[i]) { inc = false; }
                }
            }

            if(dec || inc) { count++; }
        }

        pw.println(count);

        pw.flush();
        pw.close();
        br.close();
    }
}