import java.util.Scanner;
public class DCP1221{
    public static void main (String args[]) {
        System.out.print("Calculate which fibonnaci number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(fibonacci(n));
        
        System.exit(0);
    }

    public static int fibonacci(int num){

        //base case 1, this is just defined as 0
        if(num == 0)
            return 0;

        //base case 2, this is just defined as 1
        if(num == 1)
            return 1;

        //Otherwise the function is defined as fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(num - 1) + fibonacci(num - 2);

    }
}

