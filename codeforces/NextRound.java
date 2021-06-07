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
public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int adv = 0;
        int[] scores = new int[n];

        String[] s = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(s[i]);
        }

        int min = scores[k - 1];

        for(int i = 0; i < n; i++) {
            if(scores[i] >= min && scores[i] > 0) {
                adv++;
            } else {
                break;
            }
        }

        pw.println(adv);

        pw.flush();
        pw.close();
        br.close();
    }
}