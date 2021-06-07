package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 17-10-2020, Saturday
 **/
public class CLEANUP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        int m, n;
        int[] jobs;
        StringBuilder chef, asst;
        boolean one;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            jobs = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < m; j++) {
                jobs[Integer.parseInt(st.nextToken()) - 1]++;
            }

            one = true;
            chef = new StringBuilder();
            asst = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if(jobs[j] == 0) {
                    if(one) {
                        chef.append((j + 1) + " ");
                        one = false;
                    } else {
                        asst.append((j + 1) + " ");
                        one = true;
                    }
                }
            }

            pw.println(chef.toString().trim());
            pw.println(asst.toString().trim());
        }
        
        pw.flush();
        pw.close();
        br.close();
    }
}