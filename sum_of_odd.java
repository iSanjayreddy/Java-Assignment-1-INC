
public class sum_of_odd {

	public static void main( String[] args) {
		int n = 100;
		int sum =0;
		for ( int i =0; i <= 100 ; i++) {
			if ( i %2 != 0 ) {
				sum+=i;
			}
		}
		System.out.print(sum);
	}
}
