import java.util.Scanner;

public class seriesSum {
    static int seriesSum(int n){
        if( n == 0) return 0;

       return seriesSum(n - 1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : " );
        int n = sc.nextInt();
        System.out.println("Answer : ");
       System.out.println(seriesSum(n));
        

    }
}