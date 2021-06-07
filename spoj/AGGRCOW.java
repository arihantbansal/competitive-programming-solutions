package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 28-10-2020, Wednesday
 **/
public class AGGRCOW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, c;
        int[] pos;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            pos = new int[n];
            for (int j = 0; j < n; j++) {
                pos[j] = Integer.parseInt(br.readLine().trim());
            }

            Arrays.sort(pos);

            pw.println(binarySearch(c, pos));
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int binarySearch(int c, int[] pos) {
        int left = 0, right = pos[pos.length - 1] - pos[0], mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if(validMinDistance(mid, c, pos)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static boolean validMinDistance(int d, int c, int[] pos) {
        int t = 1, last = pos[0];
        for (int i = 1; i < pos.length; i++) {
            if(pos[i] - last < d) {
                continue;
            }
            if(++t == c) {
                return true;
            }
            last = pos[i];
        }

        return false;
    }
}