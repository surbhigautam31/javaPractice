import java.util.Scanner;
public class fibinacci{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        int n= in.nextInt();

        int first = 0 , second = 1;

        for(int i= 1;i<= n;i++)
        {
            System.out.println(first +"");
            int next = first+second;
            first = second;
            second = next ; 
        }
        in.close();
    }
}