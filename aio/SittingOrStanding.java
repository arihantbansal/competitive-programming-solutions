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
public class SittingOrStanding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sitin.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("sitout.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int r = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
        int totalSeats = r * s;
        int ticketsBooked = Integer.parseInt(br.readLine());

        if(totalSeats >= ticketsBooked) {
            pw.printf("%d %d%n", ticketsBooked, 0);
        } else {
            pw.printf("%d %d%n", totalSeats, ticketsBooked - totalSeats);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}