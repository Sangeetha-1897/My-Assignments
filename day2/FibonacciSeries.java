package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=8,firstNum=0,secondNum=1,sum;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=2;i<8;i++) {
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
			
		}

	}

}
