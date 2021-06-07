package contests;

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
 * Date : 31-10-2020, Saturday
 **/
public class GSUB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, q, x, y, len, prev, next;
        List<Integer> nums;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            nums = new ArrayList<>(n);
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                nums.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < q; j++) {
                st = new StringTokenizer(br.readLine().trim());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                if (x != n) {
                    next = nums.get(x - 1);
                }
            }
        }


        pw.flush();
        pw.close();
        br.close();
    }
}