import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int hashes = 1;
        int spaces = n - hashes;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < hashes; j++) {
                System.out.print('#');
            }
            System.out.println();
            hashes++;
            spaces = n - hashes;
        }
    }
}