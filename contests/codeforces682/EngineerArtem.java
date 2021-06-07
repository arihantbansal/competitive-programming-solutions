package contests.codeforces682;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 13-11-2020, Friday
 **/
@SuppressWarnings("ALL")
public class EngineerArtem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, m;
        int[][] matrix;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            matrix = new int[n][m];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine().trim());
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int curr;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    curr = matrix[j][k];
                    if (j == 0 & k == 0) {
                        if (curr == matrix[j + 1][k]) {
                            if (curr == matrix[j][k + 1]) {
                                curr++;
                            } else if (curr != (matrix[j][k + 1] - 1)) {
                                curr++;
                            }
                        }
                        if (curr == matrix[j][k + 1]) {
                            if (curr == matrix[j + 1][k]) {
                                curr++;
                            } else if (curr != (matrix[j + 1][k] - 1)) {
                                curr++;
                            }
                        }
                    } else if (j == 0 & k == m - 1) {
                        if (curr == matrix[j + 1][k]) {
                            if (curr == matrix[j][k - 1]) {
                                curr++;
                            }
                            else if (curr != (matrix[j][k - 1] - 1)) {
                                curr++;
                            }
                        }
                        if (curr == matrix[j][k - 1]) {
                            if (curr == matrix[j + 1][k]) {
                                curr++;
                            } else if (curr != (matrix[j + 1][k] - 1)) {
                                curr++;
                            }
                        }
                    } else if (j == n - 1 && k == m - 1) {
                        if (curr == matrix[j - 1][k]) {
                            if (curr == matrix[j][k - 1]) {
                                curr++;
                            }
                            else if (curr != (matrix[j][k - 1] - 1)) {
                                curr++;
                            }
                        }
                        if (curr == matrix[j][k - 1]) {
                            if (curr == matrix[j - 1][k]) {
                                curr++;
                            } else if (curr != (matrix[j - 1][k] - 1)) {
                                curr++;
                            }
                        }
                    } else if (j == n - 1 && k == 0) {
                        if (curr == matrix[j - 1][k]) {
                            if (curr == matrix[j][k + 1]) {
                                curr++;
                            }
                            else if (curr != (matrix[j][k + 1] - 1)) {
                                curr++;
                            }
                        }
                        if (curr == matrix[j][k + 1]) {
                            if (curr == matrix[j - 1][k]) {
                                curr++;
                            } else if (curr != (matrix[j - 1][k] - 1)) {
                                curr++;
                            }
                        }
                    } else if (j == n - 1) {
                        if (curr == matrix[j][k - 1] || curr == matrix[j][k + 1]) {
                            if (curr != (matrix[j][k - 1] - 1) || curr != (matrix[j][k - 1]) - 1 || curr == (matrix[j - 1][k] - 1)) {
                                curr++;
                            }
                        }
                        if (curr == matrix[j - 1][k]) {
                            if (curr != (matrix[j][k - 1] - 1) || curr != (matrix[j][k - 1] - 1)) {
                                curr++;
                            }
                        }
                    } else if (j == 0) {
                        if (curr == matrix[j][k - 1] || curr == matrix[j][k + 1]) {

                        }
                    } else {
                        if (curr == matrix[j - 1][k] || curr == matrix[j + 1][k]) {
                            curr++;
                        }
                    }

                    matrix[j][k] = curr;
                }
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    pw.printf("%d ", matrix[j][k]);
                }
                pw.println();
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}