package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class ERROR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine().trim());

        String binary;
        for (int i = 0; i < t; i++) {
            binary = br.readLine().trim();

            pw.println((binary.contains("010") || binary.contains("101")) ? "Good" : "Bad");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}