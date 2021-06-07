package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 31-10-2020, Saturday
 **/
public class COPAR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        int n, len;
        ArrayList<Integer> seq1, seq2;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            seq1 = new ArrayList<>();
            seq2 = new ArrayList<>(n - 1);

            st = new StringTokenizer(br.readLine().trim());
            seq1.add(Integer.parseInt(st.nextToken()));

            for (int j = 0; j < n - 1; j++) {
                seq2.add(Integer.parseInt(st.nextToken()));
            }

            while ((len = coprime(seq1, seq2)) != -1) {
                for (int j = 0; j < len; j++) {
                    seq1.add(seq2.remove(0));
                }
            }

            pw.println(seq1.size());
        }


        pw.flush();
        pw.close();
        br.close();
    }

    public static int coprime(ArrayList<Integer> one, ArrayList<Integer> two) {
        int len = -1, first, second;

        for (int i = 0; i < one.size(); i++) {
            first = one.get(i);
            for (int j = 0; j < two.size(); j++) {
                second = two.get(j);
                if ((second > first && second % first == 0) || (second < first && first % second == 0)) {
                    len = j + 1;
                }
            }
        }

        return len;
    }
}