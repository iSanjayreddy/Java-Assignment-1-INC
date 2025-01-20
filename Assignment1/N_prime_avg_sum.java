import java.util.Scanner;

public class N_prime_avg_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to display: ");
        int N = scanner.nextInt();
        
        int count = 0, num = 2;
        int sum = 0;
        
        while (count < N) {
            if (isPrime(num)) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }
        
        double average = sum / (double) N;
        System.out.println("Sum of first " + N + " prime numbers: " + sum);
        System.out.println("Average of first " + N + " prime numbers: " + average);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
