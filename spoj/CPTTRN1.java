package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 22-10-2020, Thursday
 **/
public class CPTTRN1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int l, c;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            l = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            for (int j = 0; j < l; j++) {
                for (int k = 0; k < c; k++) {
                    if (j % 2 == 0) {
                        pw.print((k % 2 == 0) ? "*" : ".");
                    } else {
                        pw.print((k % 2 != 0) ? "*" : ".");
                    }
                }
                pw.println();
            }

            pw.println("");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}