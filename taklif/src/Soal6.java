import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n ,temp ,result;
        System.out.print("Enter n: ");
        n=scanner.nextInt();
    int[] res=new int[n];


        for (int i=0;i<n;i++){
            res[i] = scanner.nextInt();
        }

        result = scanner.nextInt();

        for(int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
            if(res[j]>res[j+1]){
                temp=res[j];
                res[j]=res[j+1];
                res[j+1]=temp;
        }   }
        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<n;i++){
            if (res[i]==result){
                System.out.println(i);
            }
        }



    }
}