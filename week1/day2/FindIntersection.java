package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] numbers={3,2,11,4,6,7};
		int[] values={1,2,8,4,9,7};
		System.out.println("The matching numbers are:");
		for(int i=0;i<numbers.length;i++) {
			
			for (int j = 0; j < values.length; j++) {
				
				if (numbers[i]==values[j]) {
					System.out.println( numbers[i]);
					
				}
			}
		}
		

	}

	}

