import java.util.Scanner;

public class multipleOfNum {
    static void multipleOfnum(int n, int k){
        if (k == 1) {
            System.out.println(n);
            return;
        }

        multipleOfnum(n, k-1);
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter number : " );
        int n = sc.nextInt();
        System.out.println("Enter Power of Number: ");       
        int k = sc.nextInt();

        System.out.println("Answer : ");
        multipleOfnum(n, k);
        

    }

}
