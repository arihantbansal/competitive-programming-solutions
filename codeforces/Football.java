package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        String[] names = {"", ""};
        int[] goals = new int[2];
        String team;
        for (int i = 0; i < n; i++) {
            team = br.readLine();

            if (names[0].equals(team)) {
                goals[0]++;
            } else if (names[1].equals(team)) {
                goals[1]++;
            } else if (names[0].equals("")) {
                names[0] = team;
                goals[0]++;
            } else if (names[1].equals("")) {
                names[1] = team;
                goals[1]++;
            }
        }

        pw.println(names[(goals[0] > goals[1]) ? 0 : 1]);


        pw.flush();
        pw.close();
        br.close();
    }
}