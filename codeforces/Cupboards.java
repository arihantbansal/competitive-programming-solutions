package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 24-10-2020, Saturday
 **/
public class Cupboards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int li, ri, li0 = 0, li1 = 0, ri0 = 0, ri1 = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            li = Integer.parseInt(st.nextToken());
            ri = Integer.parseInt(st.nextToken());

            if (li == 0) li0++;
            else li1++;

            if(ri == 0) ri0++;
            else ri1++;
        }
        int lt = 0, rt = 0;

        if (li0 >= li1) {
            lt = li1;
        } else {
            lt = li0;
        }

        if (ri0 >= ri1) {
            rt = ri1;
        } else {
            rt = ri0;
        }

        pw.println(lt + rt);

        pw.flush();
        pw.close();
        br.close();
    }
}