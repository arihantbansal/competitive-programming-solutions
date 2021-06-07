package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 30-10-2020, Friday
 **/
public class ZCO14001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] boxes = new int[n];

        st  = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        int pointer = 0, command;
        boolean box = false;
        st = new StringTokenizer(br.readLine().trim());
        loop:
        while((command = Integer.parseInt(st.nextToken())) != 0) {
            switch (command) {
                case 0:
                    break loop;
                case 1:
                    if (pointer == 0) break;
                    else pointer--;
                    break;
                case 2:
                    if (pointer == (n -1)) break;
                    else pointer++;
                    break;
                case 3:
                    if (boxes[pointer] > 0 && !box) {
                        box = true;
                        boxes[pointer]--;
                    }
                    break;
                case 4:
                    if (boxes[pointer] < h && box) {
                        boxes[pointer]++;
                        box = false;
                    }
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            pw.printf("%d ", boxes[i]);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}