package org.system;

public class Desktop extends Computer{
	
	public void desktopsize()
	{
		System.out.println("desktopsize");
	}
public static void main(String[] args) {
	Desktop obj= new Desktop();
	obj.computermodel();
	obj.desktopsize();
}
}
