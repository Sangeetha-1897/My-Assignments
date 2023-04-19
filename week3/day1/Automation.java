package week3.day1;

public class Automation extends MultipleLanguage{
	

	public void Java() {
System.out.println("Java");		
	}

	public void selenium() {
System.out.println("selenium");		
	}

	@Override
	public void ruby() {
System.out.println("ruby");		
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.ruby();
		obj.selenium();
		obj.Java();
		
	}

}
