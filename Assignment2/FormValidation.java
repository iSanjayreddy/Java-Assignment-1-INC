package form_validation_java;

import java.util.Scanner;

public class Formvalidationjava {
    

  public static final String userregex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
     public static final String emailregex = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
    public static final String dateregex = "^\\d{2}/\\d{2}/\\d{4}$";
    
    
    
    public static class Username {
        public boolean checker(String usernameinput) {
            return usernameinput.matches(Form_validation_java.userregex);
        }
    }

    public static class Emailid {
        public boolean checker(String emailidinput) {
            return emailidinput.matches(Form_validation_java.emailregex);
        }
    }


    public static class Date {
        public boolean checker(String dateinput) {
            return dateinput.matches(Form_validation_java.dateregex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Username section
        System.out.println("Enter a username (must start with a letter and be 8-30 characters long):");
        String usernameinput = sc.nextLine();
        Username obj1 = new Username();
        while (!obj1.checker(usernameinput)) {
            System.out.println("Invalid username. Please try again.");
            usernameinput = sc.nextLine();
        }

        // Email section
        System.out.println("Enter an email ID:");
        String emailinput = sc.nextLine();
        Emailid obj2 = new Emailid();
        while (!obj2.checker(emailinput)) {
            System.out.println("Invalid email. Please try again.");
            emailinput = sc.nextLine();
        }

        // Date section
        System.out.println("Enter a date in the format DD/MM/YYYY:");
        String dateinput = sc.nextLine();
        Date obj3 = new Date();
        while (!obj3.checker(dateinput)) {
            System.out.println("Invalid date format. Please try again.");
            dateinput = sc.nextLine();
        }

        System.out.println("All inputs are valid!");
        sc.close();  // Close the scanner to avoid resource leak
    }


}
