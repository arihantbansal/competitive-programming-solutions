package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class STONES {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine().trim()), count;
        String j, s;
        char[] chars;
        Set<Character> charSet;
        StringBuilder sb;
        char ch;
        for (int i = 0; i < t; i++) {
            j = br.readLine().trim();
            s = br.readLine().trim();

            chars = j.toCharArray();
            Arrays.sort(chars);
            charSet = new LinkedHashSet<>();
            for(char c : chars) {
                charSet.add(c);
            }
            sb = new StringBuilder();
            for (Character c : charSet) {
                sb.append(c);
            }
            j = sb.toString();

            chars = s.toCharArray();
            Arrays.sort(chars);
            s = new String(chars);

            count = 0;
            for (int k = 0; k < s.length(); k++) {
                ch = s.charAt(k);
                if (j.indexOf(ch) >= 0) count++;
            }

            pw.println(count);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}