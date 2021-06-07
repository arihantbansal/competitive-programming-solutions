package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * Author : Arihant Bansal
 * Date : 19-12-2020, Saturday
 **/
public class BitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        //long ans = (long) (((long) Math.pow(2, n)) % (Math.pow(10, 9) + 7));
        BigInteger og = new BigInteger("1").shiftLeft(n);
        BigInteger mod = og.mod(new BigInteger(String.valueOf((long) Math.pow(10, 9) + 7)));
        pw.println(mod);

        pw.flush();
        pw.close();
        br.close();
    }
}