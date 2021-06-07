package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 08-10-2020, Thursday
 **/
public class CEILRCPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        int p, menu;

        for (int i = 0; i < t; i++) {
            p = Integer.parseInt(br.readLine().trim());
            menu = items(p);
            pw.println(menu);

        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int items(int p) {
        int count = 0, amt = p;
        for (int i = 11; i >= 0; i--) {
            count += (amt / Math.pow(2, i));
            amt = (int) (amt % Math.pow(2, i));
        }
        return count;
    }
}