import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int maxside = 0;

        if (a >= b && a >= c) {
            maxside = a;
        } else if (b >= a && b >= c) {
            maxside = b;
        } else {
            maxside = c;
        }
        int sum = a * a + b * b + c * c;
        int largest = 2 * maxside * maxside;

        if (sum == largest) {
            System.out.println(2);
        } else if (sum > largest) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}
