package poj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 08-10-2020, Thursday
 **/
public class Hangover {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        double num;

        while(true) {
            num = Double.parseDouble(br.readLine().trim());
            if(num == 0) { break; }
            pw.printf("%d card(s) %n", cards(num));
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int cards(double num) {
        int i = 2;
        double overhang = 0;
        while(true) {
            overhang = overhang + (1.0 / i);
            if(overhang >= num) { break; }
            i++;
        }
        return (i - 1);
    }
}