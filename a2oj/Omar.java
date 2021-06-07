package a2oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-11-2020, Friday
 **/
public class Omar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            pw.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}