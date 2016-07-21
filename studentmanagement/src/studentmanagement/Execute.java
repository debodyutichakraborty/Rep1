package studentmanagement;

import java.util.Scanner;

public class Execute {
	
	public static void main(String [] args){
		Scanner w=new Scanner(System.in);
		
		System.out.println("Enter your Id");
		String Id=w.next();
		System.out.println("Enter your Name");
		String Name=w.next();
		System.out.println("Enter your City");
		String City=w.next();
		
		
		Student s=new Student();
		s.setid(Integer.parseInt(Id));
		s.setname(Name);
		s.setcity(City);
		s.getid();
		s.getname();
		s.getcity();
		
		
	}
}
