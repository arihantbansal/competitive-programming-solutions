package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 22-10-2020, Thursday
 **/
public class SMPSUM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken());

        long bSquare = (b * (b + 1) * ((2 * b) + 1)) / 6;
        long aSquare = (a * (a + 1) * ((2 * a) + 1)) / 6;

        pw.println(bSquare - aSquare);

        pw.flush();
        pw.close();
        br.close();
    }
}