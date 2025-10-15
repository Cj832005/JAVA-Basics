import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
    int n1 , n2 ,Result ;
    String choice;
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.print("Enter num1 : ");
        n1 = scanner.nextInt();
        System.out.print("Enter num2 : ");
        n2 = scanner.nextInt();
        System.out.print("Choice: 1.Add 2.Subtract 3.Multiply 4.Divide : ");
        choice = scanner.next();
        if(choice.equals("1")  || choice.equals("+") ){
            Result =n1+n2 ;
            System.out.println("Result =" + Result);
        }
        else if(choice.equals("2") || choice.equals("-") ){
            Result = n2>n1 ? n2-n1 : n1-n2;
            System.out.println("Result =" + Result);
        }
        else if(choice.equals("3") || choice.equals("*") ){
            Result =n1*n2;
            System.out.println("Result =" + Result);
        }
        else if(choice.equals("4") || choice.equals("/") ){
            try {
                Result = n2>n1 ? n2/n1 : n1/n2;
                System.out.println("Result =" + Result);
            }
            catch (ArithmeticException e) {

                System.out.println("Error: Division by zero!!!");
                break;
            }
        }
       System.out.println();




    }







}
}