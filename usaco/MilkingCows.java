package usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 17-11-2020, Tuesday
 **/
public class MilkingCows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("milk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());

        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();

        int start, end;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            int j, len;
            for (j = 0, len = starts.size(); j < len; j++) {
                if (starts.get(j) > start) {
                    break;
                }
            }

            starts.add(j, start);
            ends.add(j, end);
        }

        for (int i = 0; i < n + 2; i++) {
            
        }


        pw.flush();
        pw.close();
        br.close();
    }
}