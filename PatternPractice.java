import java.util.Scanner;
public class PatternPractice{
    public static void main( String[] agrs){

        Scanner in = new Scanner(System.in);

        int n = 4;
        int m = 5;

        for ( int i=1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}