import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
    int n ,min=0 , max=0,num ;
    double avg,sum=0;
    Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n: ");
        n=scanner.nextInt();

        for (int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+": ");
        num = scanner.nextInt();
        sum+=num;

        min=Math.min(num,min);
max=Math.max(num,max);        }
        avg=sum/n;
        System.out.println("Sum = "+sum);
        System.out.println("avg = " +avg);
        System.out.println("min = " +min);
        System.out.println("max = " +max);
        

    }
}
