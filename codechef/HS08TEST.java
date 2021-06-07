package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 07-10-2020, Wednesday
 **/
public class HS08TEST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double w = Double.parseDouble(st.nextToken());
        double bal = Double.parseDouble(st.nextToken());

        if(w % 5 != 0 || bal < w) {
            pw.print(String.format("%.2f", bal));
        } else {
            pw.print(String.format("%.2f", bal - w - 0.50));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}