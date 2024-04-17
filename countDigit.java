import java.util.*;
public class countDigit {
    static long countOfdigit(long n){
        if(n >= 0 && n <= 9)
            return 1;

    return  countOfdigit(n/10) + 1;
   
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        long n = sc.nextLong();
        
        System.out.println("Answer : ");
        System.out.println(countOfdigit(n));

    }
}
