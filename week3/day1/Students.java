package week3.day1;

public class Students {
	
public void getStudentInfo(int id) {
	System.out.println("the id is" +id);
}
public void getStudentInfo(int id, String name)
{
	System.out.println("the id is"  +id +","+ "the name is" +name); }

	public void getStudentInfo(String email,long phonenumber) 
	{
		System.out.println("the email id is"  +email +","+ "the phonenumber is"  +phonenumber);
	}

public static void main(String[] args) {
	Students info= new Students();
	info.getStudentInfo(1897);
info.getStudentInfo(1897, "Sangeetha");
info.getStudentInfo("abc@gmail.com", 1234567891);
}
}