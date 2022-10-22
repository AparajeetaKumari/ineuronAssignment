package gettingStarted;

public class Sum {
	
	public static void main (String args[]) {
		int[] arr= {10,90,78,111,8989,7876};
		System.out.println("Sum is::"+sum(arr));
		
	}
	
	public static int sum(int a[]) {
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum = sum + a[i];
		}
		return sum;
	}

}
