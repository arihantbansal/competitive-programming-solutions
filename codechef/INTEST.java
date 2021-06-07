package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 07-10-2020, Wed
 **/
public class INTEST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long count = 0;

        while((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            long num = Long.parseLong(st.nextToken());
            if(num % k == 0) { count++; }
        }

        pw.print(count);

        pw.flush();
        pw.close();
        br.close();

    }
}