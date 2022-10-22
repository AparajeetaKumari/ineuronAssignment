package gettingStarted;

public class Score {
	public static void main (String args[]) {
		int[] arr= {78,12,89,55,35};
		score(arr);
		
	}
	
	public static void score(int a[]) {		
		for(int i=0;i<a.length;i++) {
			if(a[i]>80) {
				System.out.println(a[i]);
			}
		}
	}

}
