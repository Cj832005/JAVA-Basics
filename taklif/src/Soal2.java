import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int n;
        char c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=scanner.nextInt();
        System.out.print("Enter character: ");
        c=scanner.next().charAt(0);

        //مثلث قایم الزاویه
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();

        //مربع توخالی
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print(c);
                    if(j==n){
                        System.out.println();
                    }
                }
                else if(j==1||j==n){
                    System.out.print(c);
                    if(j==n){
                        System.out.println();
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
        }
        System.out.println();

        //ایکس
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1) {
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                    }
                if(j==n){
                    System.out.println();
                }
            }
            }

    }
}