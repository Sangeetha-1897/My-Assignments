package week3.day2;

public class ReverseName {

	public static void main(String[] args) {
String s1="Sangeetha";
char[] charArray = s1.toCharArray();
for (int i = charArray.length - 1; i>=0 ; i--) {
	System.out.println(charArray[i]);
}
}
}