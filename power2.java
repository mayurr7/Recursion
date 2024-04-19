import java.util.Scanner;

public class power2 {
    static int powerOfNum2(int p, int q){
        if(q == 0) return 1;

        int ans1 = powerOfNum2(p, q/2);
        if(q % 2 ==0){
           return  ans1 * ans1;
        }

        return ans1 * ans1 * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter number : " );
        int p = sc.nextInt();
        System.out.println("Enter Power of Number: ");       
        int q = sc.nextInt();

        System.out.println("Answer : ");
        System.out.println(powerOfNum2(p, q));
        

    }

}
