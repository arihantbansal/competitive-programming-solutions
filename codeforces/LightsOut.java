package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class LightsOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] switches = new int[3][3];
        int count = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                count = Integer.parseInt(st.nextToken());
                if(j == 0) {
                    if(i == 0) {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j + 1] += count;
                    } else if(i == 2) {
                        switches[i][j] += count;
                        switches[i - 1][j] += count;
                        switches[i][j + 1] += count;
                    } else {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j + 1] += count;
                        switches[i - 1][j] += count;
                    }
                } else if(j == 2) {
                    if(i == 0) {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j - 1] += count;
                    } else if(i == 2) {
                        switches[i][j] += count;
                        switches[i - 1][j] += count;
                        switches[i][j - 1] += count;
                    } else {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j - 1] += count;
                        switches[i - 1][j] += count;
                    }
                } else {
                    if(i == 0) {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j + 1] += count;
                        switches[i][j - 1] += count;
                    } else if(i == 2) {
                        switches[i][j] += count;
                        switches[i - 1][j] += count;
                        switches[i][j + 1] += count;
                        switches[i][j - 1] += count;
                    } else {
                        switches[i][j] += count;
                        switches[i + 1][j] += count;
                        switches[i][j + 1] += count;
                        switches[i][j - 1] += count;
                        switches[i - 1][j] += count;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pw.printf((switches[i][j] % 2 == 0) ? "1" : "0");
            }
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}