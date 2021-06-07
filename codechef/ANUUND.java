package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 26-10-2020, Monday
 **/
public class ANUUND {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, least, most;
        int[] nums;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());

            st = new StringTokenizer(br.readLine().trim());
            nums = new int[n];
            
            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);
            least = 0;
            if (n % 2 == 0) {
                most = n / 2;
                for (int j = 0; j < (n / 2); j++) {
                    pw.printf("%d %d ", nums[least], nums[most]);
                    least++;
                    most++;
                }
            } else {
                most = (n / 2) + 1;
                while (most < n) {
                    pw.printf("%d %d ", nums[least], nums[most]);
                    least++;
                    most++;
                }
                pw.printf("%d", nums[least]);
            }


            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}