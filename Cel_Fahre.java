import java.util.*;

public class Cel_Fahre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in Celcius: ");
        int C = sc.nextInt();

        int F = C * 9 / 5 + 32;
        System.out.println("The Celcius to Fahrenheit is: " + F);
    }
}
