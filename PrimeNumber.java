package gettingStarted;

public class PrimeNumber {

	public static void main(String[] args) {
		prime(1000);
		
		

	}
	
	public static void prime(int n) {
		int counter;
		int j;
		for (int i=1;i<=n;i++) {
			counter=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
					counter++;
			}
			if(counter==2) {
				System.out.println(i);
			}
		}
	}
	

}
