import java.util.*;

public class Index_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int a = sc.nextInt();
        System.out.print("Enter the array Elements: ");
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the array Number: ");
        int x = sc.nextInt();
        System.out.print("The array Num Index is: ");

        for (int i = 0; i < a; i++) {
            if (arr[i] == x) {
                System.out.print(i);
            }
        }
    }
}
