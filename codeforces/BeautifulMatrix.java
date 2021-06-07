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
public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int x = 0, y = 0, n;

        row:
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            column:
            for (int j = 0; j < 5; j++) {
                n = Integer.parseInt(st.nextToken());
                if(n == 1) {
                    x = i + 1;
                    y = j + 1;
                    break row;
                }
            }
        }

        pw.println(Math.abs(x - 3) + Math.abs(y - 3));

        pw.flush();
        pw.close();
        br.close();
    }
}