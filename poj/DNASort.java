package poj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class DNASort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int len = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        List<String> dna = new ArrayList<String>(num);
        for (int i = 0; i < num; i++) {
            dna.add(br.readLine().trim());
        }

        dna.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return getUnsortedness(a) - getUnsortedness(b);
            }
        });

        for(String a : dna) {
            pw.println(a);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int getUnsortedness(String a) {
        int count = 0, len = a.length();
        char[] chars = a.toLowerCase().toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(chars[i] > chars[j]) { count++; }
            }
        }
        return count;
    }
}