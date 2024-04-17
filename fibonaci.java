import java.util.Scanner;

public class fibonaci {
    static int fib(int n){
        if(n == 0 || n == 1)
         return n;

         int prev = fib(n - 1);
         int prevPre = fib(n - 2);

         return   prev + prevPre;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number of series : ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(fib(i));
        }
        
    }
}
