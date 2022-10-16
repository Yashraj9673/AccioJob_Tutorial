import java.util.*;

public class Duplicate_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i] == arr[j]) {
                    b++;
                    break;
                }
            }
        }
        if (b == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
