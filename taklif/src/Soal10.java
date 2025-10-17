import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , r , mainDiagonalSum =0 , secondaryDiagonalSum=0;
        n = scanner.nextInt();
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r=(i + 1) * (j + 1);
                res[i][j] = r;
                if(i==j){
                    mainDiagonalSum += res[i][j];
                }
                else if(i+j==n-1){
                    secondaryDiagonalSum+=res[i][j];
                }
            }

        }
        System.out.println(Arrays.deepToString(res));
        System.out.println("mainDiagonalSum = "+mainDiagonalSum);
        System.out.println("secondaryDiagonalSum = "+secondaryDiagonalSum);






    }
    }