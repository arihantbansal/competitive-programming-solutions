package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 02-01-2021, Saturday
 **/
public class BILLRD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        long n, k, x, y, xf, yf, mod;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Long.parseLong(st.nextToken());
            k = Long.parseLong(st.nextToken());
            x = Long.parseLong(st.nextToken());
            y = Long.parseLong(st.nextToken());

            mod = k % 4;
            xf = 0;
            yf = 0;
            if (x == y) {
                xf = n;
                yf = n;
            } else if (x > y) {
                if (k <= 3) {
                    if (k == 1) {
                        xf = n;
                        yf = n + y - x;
                    } else if (k == 2) {
                        xf = n + y - x;
                        yf = n;
                    } else if (k == 3) {
                        yf = x - y;
                    }
                } else {
                    x = x - y;
                    y = 0;
                    if (mod == 0) {
                        xf = x;
                        yf = y;
                    } else if (mod == 1) {
                        xf = n;
                        yf = n + y - x;
                    } else if (mod == 2) {
                        xf = n + y - x;
                        yf = n;
                    } else if (mod == 3) {
                        yf = x - y;
                    }
                }
            } else {
                if (k <= 3) {
                    if (k == 1) {
                        yf = n;
                        xf = n - y + x;
                    } else if (k == 2) {
                        yf = n - y + x;
                        xf = n;
                    } else if (k == 3) {
                        xf = y - x;
                    }
                } else {
                    y = y - x;
                    x = 0;
                    if (mod == 0) {
                        yf = y;
                        xf = x;
                    } else if (mod == 1) {
                        yf = n;
                        xf = n - y + x;
                    } else if (mod == 2) {
                        yf = n - y + x;
                        xf = n;
                    } else if (mod == 3) {
                        xf = y - x;
                    }
                }
            }

            pw.printf("%d %d\n", xf, yf);
        }


        pw.flush();
        pw.close();
        br.close();
    }
}