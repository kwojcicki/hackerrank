package solutions.mathematics.strange_grid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the strangeGrid function below.
     */
    static int strangeGrid(int a, int b) {
        /*
         * Write your code here.
         */
    	long r = a;
    	long c = b;
    	long ans = (r%2==1 ? (r-1)*5+(c-1)*2:(r-2)*5+1+(c-1)*2);
    	return (int)ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rc = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = Integer.parseInt(rc[0]);

        int c = Integer.parseInt(rc[1]);

        int result = strangeGrid(r, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}