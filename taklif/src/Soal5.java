import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int n  ;
        double res ,result =0;
        String choice;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("1.Celsius → Fahrenheit  2.Fahrenheit → Celsius  3.Kilometer → Mile  4.Mile → Kilometer  0.Exit");
        choice = scanner.nextLine();
        n=Integer.parseInt(choice);
        res=scanner.nextInt();

        switch(choice){
            case "1":
                result +=res*1.8 +32;
                System.out.println("Result: " +result );
                break;
            case "2":
                    result +=(res-32)/1.8 ;
                System.out.println("Result: " +result);
                break;
            case "3":
                result +=res*0.621371;
                System.out.println("Result: " +result);
                break;
            case "4":
                result +=res/0.621371;
                System.out.println("Result: " +result);
                break;

        }

        }while(n!=0);
        System.out.println("bye!");
        




    }
    }