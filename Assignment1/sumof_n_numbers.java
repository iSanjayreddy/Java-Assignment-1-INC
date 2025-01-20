import java.util.Scanner;
public class sumof_n_numbers {
public static void main ( String[] args) {
Scanner sc = new Scanner(System.in);
int sum =0,i=0;
int n = sc.nextInt();
while( i<n) {
	sum+=i;
	i++;
}
System.out.print(sum);
}
}
