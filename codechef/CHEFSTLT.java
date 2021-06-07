package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class CHEFSTLT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        char[] first, second;
        int len, min, max;
        char one, two;
        for (int i = 0; i < t; i++) {
            first = br.readLine().trim().toCharArray();
            second = br.readLine().trim().toCharArray();
            len = first.length;
            min = 0;
            max = len;

            for (int j = 0; j < len; j++) {
                one = first[j];
                two = second[j];
                if(one != '?' && two != '?') {
                    if(one != two) {
                        min++;
                    } else {
                        max--;
                    }
                }
            }
            pw.println(min + " " + max);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}