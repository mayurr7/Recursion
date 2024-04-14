import java.util.*;
public class printTincreasingNum {
    static void printTincreasing(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }

        printTincreasing(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Answer is : ");
        printTincreasing(n);

    }    
}