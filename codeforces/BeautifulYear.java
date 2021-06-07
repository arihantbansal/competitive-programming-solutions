package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class BeautifulYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        pw.println(beautifulYear(year));

        pw.flush();
        pw.close();
        br.close();
    }

    public static int beautifulYear(int year) {
        int i;

        for (i = year + 1;; i++) {
            if(!duplicate(i)) { break; }
        }

        return i;
    }

    public static boolean duplicate(int year) {
        List list = Arrays.asList(String.valueOf(year).split(""));
        Set set = new HashSet(list);
        return list.size() > set.size();
    }
}