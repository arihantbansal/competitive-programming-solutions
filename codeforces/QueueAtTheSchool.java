package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        String s = br.readLine();

        for (int i = 0; i < t; i++) {
            s = queue(s);
        }

        pw.println(s);

        pw.flush();
        pw.close();
        br.close();
    }

    public static String queue(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        char[] updated = new char[len];
        updated[0] = chars[0];

        for (int i = 1; i < len; i++) {
            if(chars[i] == 'G' && chars[i - 1] == 'B') {
                updated[i - 1] = 'G';
                updated[i] = 'B';
            } else {
                updated[i] = chars[i];
            }
        }

        return new String(updated);
    }
}