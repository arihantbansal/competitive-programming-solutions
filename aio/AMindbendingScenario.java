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
public class AMindbendingScenario {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bendin.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("bendout.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        int a1 = (x2 - x1) * (y2 - y1);
        int a2 = (x4 - x3) * (y4 - y3);

        int aIntersection = Math.max(0, Math.min(x2 - x3, x4 - x1) * Math.min(y2 - y3, y4 - y1));

        pw.println(a1 + a2 - aIntersection);

        pw.flush();
        pw.close();
        br.close();
    }
}