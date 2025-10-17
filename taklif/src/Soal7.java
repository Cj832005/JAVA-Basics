import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n=scanner.nextInt();
        boolean is_prime =true;
        if(n<=1){
            is_prime=true;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    is_prime=false;
                    break;
                }
            }
        }
        System.out.println("prime("  + n+ ") = " +is_prime);

        System.out.print("primes<="+n+": " );
        for(int i=2;i<n;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                if(i==2){
                    isPrime=true;
                }
            }
                if (isPrime) {
                System.out.print(" " +i);
        }

}
        int a = scanner.nextInt();


        int b = scanner.nextInt();

        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("gcd(" + a + "," + b + ") = " + gcd);
        System.out.println("lcm(" + a + "," + b + ") = " + lcm);




    }
    }