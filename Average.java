package gettingStarted;

public class Average {

	public static void main (String args[]) {
		int[] arr= {10,90,78,111,8989,7876};
		System.out.println("Average is::"+average(arr));
		
	}
	
	public static int average(int a[]) {
		int sum =0;
		if(a.length==0) {
			return 0;
		}
		else {
			for(int i=0;i<a.length;i++){
				sum = sum + a[i];
			}
		}
		
		return sum/a.length;
	}

}
