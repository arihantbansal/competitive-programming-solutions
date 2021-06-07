package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class LAPIN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        String word;

        for (int i = 0; i < t; i++) {
            word = br.readLine().trim();
            pw.println(checkLapin(word) ? "YES" : "NO");
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static boolean checkLapin(String word) {
        int len = word.length();

        char[] first = word.substring(0, len / 2).toCharArray();
        char[] second = word.substring((int) Math.ceil((double) len / 2)).toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return String.valueOf(first).equalsIgnoreCase(String.valueOf(second));
    }
}