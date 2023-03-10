package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
int a=34343,temp,sum=0,rem;
 temp=a;
          for(;a>0;a/=10){
           rem=a%10;
           sum=(sum*10)+rem;
          }
if(sum==temp) {
System.out.println(temp+" is a palindrome number ");
}
else {
System.out.println(temp+" is not a palindrome number ");
}


}


	}

