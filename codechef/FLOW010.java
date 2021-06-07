package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class FLOW010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());
        String letter;

        for (int i = 0; i < t; i++) {
            letter = br.readLine().toLowerCase();
            switch(letter) {
                case "b":
                    pw.println("BattleShip");
                    break;
                case "c":
                    pw.println("Cruiser");
                    break;
                case "d":
                    pw.println("Destroyer");
                    break;
                case "f":
                    pw.println("Frigate");
                    break;
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}