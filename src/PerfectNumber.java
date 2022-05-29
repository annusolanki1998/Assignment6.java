import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for( int i=1; i<number; i++)
        {
            if(number%i==0){
                sum = sum+i;
            }
        }
        if(sum==number)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
}
