package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * Author : Arihant Bansal
 * Date : 06-11-2020, Friday
 **/
public class RRUN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        long subsets[];
        Map<Integer, Integer> speeds;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());

            speeds = new TreeMap<>();
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                speeds.put(Integer.parseInt(st.nextToken()), j);
            }

            subsets = new long[n];
            int value;
            long t1, t2, t3, mod = (long) (Math.pow(10, 9) + 7);
            for (Map.Entry<Integer, Integer> pair : speeds.entrySet()) {
                value = pair.getValue();
                t1 = (long) ((Math.pow(2, value) - 1) % mod);
                t2 = (long) ((Math.pow(2, value) * (n - 1 - value)) % mod);
                t3 = (long) ((Math.pow(2, value) * ((n - 1 - value) * (n - 2 - value)) / 2) % mod);
                subsets[value] = (t1 + ((t2 + t3) % mod)) % mod;
            }
            //TODO Fix!
            pw.println(new StringBuilder(Arrays.toString(subsets)).reverse().toString().replaceAll("[]\\[\\],]", ""));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}