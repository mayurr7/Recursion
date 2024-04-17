import java.util.Scanner;

public class factorial {
    static int factorialN(int n){
        if(n == 0) return 1;

        int fact = factorialN(n - 1);

        return n * fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n =  sc.nextInt();

        System.out.println("answe is: "+ factorialN(n));
    }
}
