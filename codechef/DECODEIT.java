package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 01-01-2021, Friday
 **/
public class DECODEIT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim()), n;
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            String word = br.readLine().trim();

            StringBuilder sb = new StringBuilder();
            for (int j = 0, len = word.length(); j < len; j += 4) {
                sb.append(letters[Integer.parseInt(word.substring(j, j + 4), 2)]);
            }

            pw.println(sb.toString());
        }

        pw.flush();
        pw.close();
        br.close();
    }
}