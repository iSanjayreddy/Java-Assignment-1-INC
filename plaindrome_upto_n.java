import java.util.Scanner;

public class plaindrome_upto_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit (N): ");
        int N = scanner.nextInt();
        
        System.out.println("Palindrome numbers up to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            int originalNumber = num;
            int reversedNumber = 0;
            
            while (num != 0) {
                int digit = num % 10;
                reversedNumber = reversedNumber * 10 + digit;
                num /= 10;
            }
            
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
