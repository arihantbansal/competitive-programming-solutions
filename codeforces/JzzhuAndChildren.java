package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 25-10-2020, Sunday
 **/
public class JzzhuAndChildren {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> candies = new ArrayDeque<Integer>(n);
        ArrayDeque<Integer> positions = new ArrayDeque<Integer>(n);
        
        st = new StringTokenizer(br.readLine().trim());

        for (int i = 1; i <= n; i++) {
            positions.addLast(i);
            candies.addLast(Integer.parseInt(st.nextToken()));
        }

        int left, pos = 1;
        while (!candies.isEmpty()) {
            left = candies.removeFirst() - m;
            pos = positions.removeFirst();
            if (left > 0) {
                candies.addLast(left);
                positions.addLast(pos);
            }
        }

        pw.println(pos);

        
        pw.flush();
        pw.close();
        br.close();
    }
    /*
    Another way is to simply calculate maximum value of the ceil(a_i / m)
    The answer would be i for which the max occurs
     */
}