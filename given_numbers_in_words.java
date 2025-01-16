import java.util.Scanner;

public class given_numbers_in_words {
    
    private static final String[] belowTwenty = {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
        "Eighteen", "Nineteen"
    };
    
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    private static final String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convertToWords(num));
        }
    }

    private static String convertToWords(int num) {
        int i = 0;
        String result = "";
        
        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }
        
        return result.trim();
    }

    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return belowTwenty[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
        }
    }
}
