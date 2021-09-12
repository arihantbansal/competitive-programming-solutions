package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class REPLESX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

            int[] a = new int[N];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < N; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            int steps = 0;
            while (a[p] != X) {
                a[k] = 0;
                Arrays.sort(a);
                // TODO Complete it!
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}