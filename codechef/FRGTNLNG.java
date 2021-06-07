package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 27-10-2020, Tuesday
 **/
public class FRGTNLNG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, count;
        String[] forgotten;
        List<String> modern;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            forgotten = br.readLine().trim().split(" ");
            modern = new ArrayList<String>();


            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine().trim());
                count = Integer.parseInt(st.nextToken());
                for (int l = 0; l < count; l++) {
                    modern.add(st.nextToken().trim());
                }
            }

            for (int j = 0; j < n; j++) {
                pw.print((modern.contains(forgotten[j])) ? "YES " : "NO ");
            }
            pw.println();
        }


        pw.flush();
        pw.close();
        br.close();
    }
}