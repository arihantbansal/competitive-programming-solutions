package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumOne = 0;
        int sumTwo = 0;

        for(int currentOne = 0, currentTwo = n - 1; currentOne < n; currentOne ++, currentTwo--) {
            String[] inputLine = scan.nextLine().split(" ");
            sumOne += Integer.parseInt(inputLine[currentOne]);
            sumTwo += Integer.parseInt(inputLine[currentTwo]);
        }

        

        System.out.println(Math.abs(sumOne - sumTwo));
    }
}
