import java.util.Scanner;

public class printDecresingNum {
    static void printDcreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }

        System.out.print(n + " ");
        printDcreasing( n - 1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Answer is : ");
        printDcreasing(n);
        

    }   
}
