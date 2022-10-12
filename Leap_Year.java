import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int leap = 1;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 != 0) {
                    leap = 0;
                } else {
                    leap = 1;
                }
            } else {
                leap = 1;
            }
        } else {
            leap = 0;
        }
        System.out.println(leap);
    }
}