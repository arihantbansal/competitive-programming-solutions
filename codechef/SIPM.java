package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class SIPM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine().trim());

            int pos = 0, neg = 0;
            Set<Integer> distinctNumbers = new HashSet<Integer>();
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (!distinctNumbers.contains(num)) {
                    distinctNumbers.add(num);
                    if (num > 0) pos += num;
                    else neg += num;
                }
            }

            pw.println(String.format("%d %d", pos, neg));
        }


        pw.flush();
        pw.close();
        br.close();
    }
}