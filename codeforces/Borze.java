package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class Borze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();

        pw.printf("%s%n", convertBorze(chars));

        pw.flush();
        pw.close();
        br.close();
    }

    public static String convertBorze(char[] chars) {
        int len = chars.length;
        StringBuilder sb = new StringBuilder(len);
        char c;

        for (int i = 0; i < len; i++) {
            c = chars[i];
            if(c == '.') {
                sb.append("0");
            } else if(c == '-') {
                sb.append((chars[i + 1] == '.') ? "1" : "2");
                i++;
            }
        }
        return sb.toString();
    }
}