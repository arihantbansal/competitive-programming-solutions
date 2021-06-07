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
public class FinMan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        double sum = 0;

        for (int i = 0; i < 12; i++) {
            sum += Double.parseDouble(br.readLine().trim());
        }

        pw.printf("%s%.2f", "$", sum / 12);

        pw.flush();
        pw.close();
        br.close();
    }
}