package week3.day2;

public class PalindromeChar {

	public static void main(String[] args) {
	String v1="Madam";
	String rev="";
	int S = v1.length();
	for (int i = S-1; i>=0; i--) {
		rev=rev+v1.charAt(i);
	}
	if(v1.equalsIgnoreCase(rev))
	{
		System.out.println("the given string is palindrome");
	}
	else
		System.out.println("the given string is not a palindrome");
		}
	}