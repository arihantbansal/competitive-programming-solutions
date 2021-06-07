package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 10-01-2021, Sunday
 **/
public class WIPL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        /**

import java.util.*;
import java.lang.*;
import java.io.*;
        class Codechef
        {
            public static void main (String[] args) throws java.lang.Exception
            {
                // your code goes here
                Scanner scan = new Scanner(System.in);
                int t = scan.nextInt();

                while(t-- > 0) {
                    int n = scan.nextInt();
                    int k = scan.nextInt();

                    int h[] = new int[n];
                    LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();

                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        h[i] = scan.nextInt();
                    }

                    Arrays.sort(h);
                    h1.add(h[n - 1]);
                    sum = h[n - 1];
                    int z = -1;
                    for (int i = n - 2; i >= 0; i--) {
                        LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
                        sum += h[i];
                        Iterator i1 = h1.iterator();
                        while(i1.hasNext()) {
                            int p = (int) (i1.next());
                            h2.add(p);
                            h2.add(h[i]);
                            h2.add(p + h[i]);
                            if((p + h[i] >= k) && (sum - p - h[i] >= k)) {
                                z = n - i;
                                break;
                            }
                            if ((h[i] >= k) && (sum - h[i] >= k)) {
                                z = n - i;
                                break;
                            }
                        }
                        if (z != -1) {
                            break;
                        }
                        h1 = h2;
                    }
                    System.out.println(z);
                }
            }
        }
**/


        pw.flush();
        pw.close();
        br.close();
    }
}