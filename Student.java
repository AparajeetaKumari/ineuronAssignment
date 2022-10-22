package gettingStarted;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name;
	private String phone;
	private String email;
	private String address;
    private boolean status;
	
	public Student(String name,String phone, String email, String address,boolean status) {
		this.name = name ;
		this.phone=phone;
		this.email = email;
		this.address=address;
		this.status = status;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		System.out.println("Enter number of Student");
		int num = sc.nextInt();
		String name;
		String email;
		String phone;
		String address;
		boolean status;
		
		for(int i=0;i<num;i++) {
			System.out.println("Please enter name");
			name = sc.next();
			System.out.println("Please enter email");
			email = sc.next();
			System.out.println("Please enter phone");
			phone = sc.next();
			System.out.println("Please enter address");
			address = sc.next();
			System.out.println("Please enter status");
			status = sc.nextBoolean();
			Student student = new Student(name, email,phone,address,status);
			students.add(student);
			
		}
		System.out.println("Please enter which student details are you looking for");
		int index= sc.nextInt();
		if(index>num) {
			System.out.println("Enter valid index");
		}else {
			System.out.println(students.get(index).name);
			System.out.println(students.get(index).email);
			System.out.println(students.get(index).phone);
			System.out.println(students.get(index).address);
			System.out.println(students.get(index).status);
		}
		
	}

}
