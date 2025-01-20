package form_validation_java;
import java.util.Scanner;
public class Form_validation_java {

	
	
	public static final String userregex = "^[a-zA-Z][a-zA-Z0-9]{7,29}$";
	public static final String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String dateregex = "^\\d{2}/\\d{2}/\\d{4}$";
public static void main(String[] args) {

Scanner sc= new Scanner(System.in);


//username section
String usernameinput = sc.nextLine();
Username obj1 = new Username();
while(!obj1.checker(usernameinput)) {
	System.out.println("Check the username again");
	 usernameinput = sc.nextLine();
}



//email id section
String emailinput = sc.nextLine();
Emailid obj2 = new Emailid();
while(!obj2.checker(emailinput)) {
	System.out.println("Check the email again");
 emailinput = sc.nextLine();

}







// date section
String dateinput = sc.nextLine();
Date obj3 = new Date();
while(!obj3.checker(dateinput)) {
	System.out.println("Check the date again");
	 dateinput = sc.nextLine();
}

}

public class Username{

	public boolean checker(String usernameinput) {
		return usernameinput.matches(Form_validation_java.userregex);
	}
}
public class Emailid{
	public boolean checker(String emailidinput) {
		return emailidinput.matches(Form_validation_java.emailregex);
	}
}


public class Date{
	public boolean checker(String dateinput) {
		return dateinput.matches(Form_validation_java.dateregex);
	}
}

}