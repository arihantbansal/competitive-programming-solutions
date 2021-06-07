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
public class LuckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        pw.printf(isAlmostLucky(n) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }

    public static boolean isAlmostLucky(int n) {
        int counter = 0;
        int[] luckyNums = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        for (int i = luckyNums[counter]; i <= n; i = luckyNums[counter]) {
            if(n % i == 0) {
                return true;
            }
            counter++;
            if(counter >= luckyNums.length) { break; }
        }
        return false;
    }
}