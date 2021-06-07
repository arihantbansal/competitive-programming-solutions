package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class VOTERS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()), n3 = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> voters = new TreeMap<>();

        for(int i = 0; i < (n1 + n2 + n3); i++) {
            int a = Integer.parseInt(br.readLine().trim());
            if(voters.containsKey(a)) {
                Integer freq = voters.get(a);
                voters.put(a, freq + 1);
            } else {
                voters.put(a, 1);
            }
        }
        br.close();
        ArrayList<Integer> flist = new ArrayList<Integer>();

        for(Map.Entry<Integer, Integer> entry : voters.entrySet()) {
            if(entry.getValue() >= 2) {
                flist.add(entry.getKey());
            }
        }

        pw.printf("%d\n", flist.size());
        for(Integer i : flist) {
            pw.printf("%d\n", i);
        }

        pw.flush();
        pw.close();
    }
}
