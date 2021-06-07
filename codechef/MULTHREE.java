package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 01-11-2020, Sunday
 **/
public class MULTHREE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        int d0, d1;
        long k, sum, last, rem;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            k = Long.parseLong(st.nextToken());
            d0 = Integer.parseInt(st.nextToken());
            d1 = Integer.parseInt(st.nextToken());

            if (k == 2 || ((d0 + d1) % 10 == 0)) {
                pw.println(((d0 + d1) % 3 == 0) ? "YES" : "NO");
                continue;
            }

            last = (d0 + d1) % 10;
            sum = d0 + d1 + last;

            rem = k - 3;
            while (rem > 0) {
                if (last == 6) {
                    long sets = rem / 4;
                    sum += sets * 20;
                    rem -= (sets * 4);
                    if (rem == 1) {
                        sum += 2;
                    } else if (rem == 2) {
                        sum += 6;
                    } else if (rem == 3) {
                        sum += 14;
                    }
                    break;
                } else if (last == 0) {
                    break;
                } else {
                    last = (last * 2) % 10;
                    sum += last;
                    rem--;
                }
            }

            pw.println((sum % 3 == 0) ? "YES" : "NO");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}