package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 22-10-2020, Thursday
 **/
public class EXPECT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String input;

        while (!(input = br.readLine().trim()).equals("42")) {
            pw.println(input);
        }

        pw.println("42");

        pw.flush();
        pw.close();
        br.close();
    }
}