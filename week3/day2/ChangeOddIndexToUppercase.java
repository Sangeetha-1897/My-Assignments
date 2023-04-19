package week3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
String test = "changeme";
char[] value = test.toCharArray();
for (int i = 0; i < value.length; i++) {
	if(i%2!=0)
	{
		char s1 = test.charAt(i);
		System.out.println(Character.toUpperCase(s1));
	}
	else
		System.out.println(value[i]);
}
	}

}
