package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 17-10-2020, Saturday
 **/
public class CEILAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        String num = String.valueOf(a - b);
        int len = num.length();

        if(num.charAt(len - 1) == '9') {
            pw.println(Integer.parseInt(num) -  1);
        } else {
            pw.println(Integer.parseInt(num) + 1);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}