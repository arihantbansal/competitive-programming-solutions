package aio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 11-10-2020, Sunday
 **/
public class MixedFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mixin.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("mixout.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int dividend = Integer.parseInt(st.nextToken()), divisor = Integer.parseInt(st.nextToken());

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        pw.println((remainder != 0) ? String.format("%d %s%n", quotient, String.format("%d/%d", remainder, divisor)) : String.format("%d%n", quotient));

        pw.flush();
        pw.close();
        br.close();
    }
}