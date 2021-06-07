package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 24-10-2020, Saturday
 **/
public class IsYourHorseshoeOnOtherHoof {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        List<Integer> shoes = new ArrayList<>();
        int count = 4, curr;

        for (int i = 0; i < 4; i++) {
            curr = Integer.parseInt(st.nextToken().trim());
            if (!shoes.contains(curr)) count--;
            shoes.add(curr);
        }

        pw.println(count);
        
        pw.flush();
        pw.close();
        br.close();
    }
}