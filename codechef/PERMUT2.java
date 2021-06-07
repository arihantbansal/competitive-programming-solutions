package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 16-10-2020, Friday
 **/
public class PERMUT2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> nums, posList;
        Integer[] pos;

        while (n != 0) {
            st = new StringTokenizer(br.readLine().trim());

            nums = new ArrayList<>();
            pos = new Integer[n];

            for (int i = 0; i < n; i++) {
                nums.add(Integer.parseInt(st.nextToken()));
                pos[nums.get(i) - 1] = i + 1;
            }

            posList = Arrays.asList(pos);
            pw.println((nums.equals(posList) ? "ambiguous" : "not ambiguous"));
            n = Integer.parseInt(br.readLine().trim());
        }

        pw.flush();
        pw.close();
        br.close();
    }
}