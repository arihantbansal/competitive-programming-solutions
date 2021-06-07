package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 20-11-2020, Friday
 **/
public class Elephant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int coord = Integer.parseInt(br.readLine().trim());
        int steps = Math.floorDiv(coord, 5);

        if (coord % 5 != 0) steps++;

        pw.println(steps);

        pw.flush();
        pw.close();
        br.close();
    }
}