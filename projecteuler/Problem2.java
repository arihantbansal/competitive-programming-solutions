package projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 18-10-2020, Sunday
 **/
public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        int first = 1, second = 2, term, temp, sum = 2;

        while((term = first + second) < n) {
            if (term % 2 == 0) {
                sum += term;
            }

            temp = second;
            second = term;
            first = temp;
        }

        pw.println(sum);

        pw.flush();
        pw.close();
        br.close();
    }
}