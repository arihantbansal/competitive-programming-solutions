package aio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Addition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("addin.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("addout.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        pw.printf("%d\n", (a + b));

        pw.flush();
        pw.close();
        br.close();

    }
}