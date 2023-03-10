package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,7,6,8};
		int sum1,sum2=0,sum3;	
		int n=arr.length;
		sum1=((n+1)*(n+2))/2;
		
		for (int i=0; i < n; i++) {
			sum2+=arr[i];
			
	    }
		
		sum3=sum1-sum2;
		System.out.println(sum3 + " is the missing number");

	}

	}

