import java.util.Scanner;

public class power {
    static int powerOfNum(int p , int q){
        if(q == 0) return 1;

        return powerOfNum(p, q-1) * p ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter number : " );
        int p = sc.nextInt();
        System.out.println("Enter Power of Number: ");       
        int q = sc.nextInt();

        System.out.println("Answer : ");
        System.out.println(powerOfNum(p, q));
        

    }
}
