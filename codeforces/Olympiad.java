package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-12-2020, Sunday
 **/
public class Olympiad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim()), num;

        st = new StringTokenizer(br.readLine().trim());
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num != 0) {
                nums.add(num);
            }
        }

        pw.println(nums.size());


        pw.flush();
        pw.close();
        br.close();
    }
}