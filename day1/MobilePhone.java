package week1.day1;

public class MobilePhone {
	public void makecall() {
		System.out.println("makecall");
		String Mobilename = "Redmi";
		float Mobilecost= 29999f;
		System.out.println(Mobilename);
		System.out.println(Mobilecost);
		
	}
	public void sendmessage() {
		System.out.println("sendmessage");
		boolean fullycharged= true;
		int mobilecost = 30000;
		System.out.println(fullycharged);
		System.out.println(mobilecost);
	}
		
		public static void main(String[] args) {
			MobilePhone Mob=new MobilePhone();
			Mob.makecall();
			Mob.sendmessage();
	System.out.println("This is my mobile");
			
		}
		
}


