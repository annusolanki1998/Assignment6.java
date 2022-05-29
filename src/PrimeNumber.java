import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for(int i = 2; i < number; i++ ){
            if(number%i==0)
            {
                x=0;
                break;
            }
        }
        if(x==1)
            System.out.println("It is Prime number ");
        else
            System.out.println("It is not a Prime number");
    }
}
