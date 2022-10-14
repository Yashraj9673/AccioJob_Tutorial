import java.util.*;

public class Transpose_Matrix {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the Matrix: ");
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose matrix is: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}