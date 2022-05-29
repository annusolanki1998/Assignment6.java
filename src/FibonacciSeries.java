import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter limit: ");
        int limit = scanner.nextInt();
        a = 1;
        b = 2;
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        while(c<=limit){
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
