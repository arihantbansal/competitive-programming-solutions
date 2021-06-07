package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 07-10-2020, Wednesday
 **/
public class FLOW006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line =  br.readLine();

        int t = Integer.parseInt(line.trim());
        char[] nums;
        int sum = 0;

        for(int i = 0; i < t; i++) {
            line = br.readLine();
            nums = line.toCharArray();
            for(int j = 0; j < nums.length; j++) {
                sum = sum + Character.getNumericValue(nums[j]);
            }
            pw.println(sum);
            sum = 0;
        }

        pw.flush();
        pw.close();
        br.close();
    }
}