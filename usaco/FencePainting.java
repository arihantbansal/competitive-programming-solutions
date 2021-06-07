package usaco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 18-11-2020, Wednesday
 **/
public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("paint.out"));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine().trim());
        int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());

        int[] cover = new int[100];

        for (int i = a; i < b; i++) cover[i] = 1;
        for (int i = c; i < d; i++) cover[i] = 1;
        int ans = 0;
        for (int i = 0; i < 100; i++) ans += cover[i];

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}