import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 'A' Array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter the length of 'B' Array: ");
        int b = sc.nextInt();
        int arrb[] = new int[b];

        System.out.print("Enter the 'A' Elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the 'B' Elements: ");
        for (int i = 0; i < b; i++) {
            arrb[i] = sc.nextInt();
        }
        System.out.print("The same Elements in 'A' and 'B' is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrb.length; j++) {
                if (arr[i] == arrb[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
