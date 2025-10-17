import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, res = 0;
        n = Math.random()*100;
        n = Math.round(n);

        while (true) {
            System.out.print("Guess?  ");
            int guess = scanner.nextInt();
            if (guess > n) {
                System.out.println("Lower");
                res += 1;
            } else {
                System.out.println("Upper");
                res += 1;
            }
            if (res == n) {
                break;
            }


        }
        System.out.println(res);
    }
}