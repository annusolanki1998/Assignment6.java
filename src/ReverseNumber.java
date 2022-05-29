import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        //System.out.println("Enter a number: ");
        int digit, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while(number != 0 ){
            digit = number%10;
            number = number/10;
            rev=(rev*10)+digit;
        }
        System.out.println("The reverse of number is : " +rev);
    }
}
