import java.util.Scanner;

public class Calculator{
    public static void main( String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        System.out.println("choose operator : * - + /");
        char operator = sc.next().charAt(0);

        double result;

        switch( operator)
        {
            case '+' :
            result = num1 + num2;
            System.out.println("Result = " +result);
            break;

            case '-' :
            result = num1 - num2 ;
            System.out.println("Result = " +result);
            break;

            case '*' :
            result = num1 * num2;
            System.out.println("Result = " +result);
            break;


            case '/' :

            if(num2 !=0){
                result = num1/num2;
                System.out.println("Result = " +result);


            }else {
                System.out.println("error divon by zero not allowed");
            }
            break;
 
        
            default :
            System.out.println("invalid operator");

            }

            sc.close();

    }
}