package gettingStarted;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
	private String name;
	private String department;
	private String email;
	private int id;
	private String teach;

	
	public Trainer(String name,String department, String email, int id, String teach) {
		this.name = name ;
		this.department=department;
		this.email = email;
		this.id=id;
		this.teach = teach;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Trainer> trainesList = new ArrayList<>();
		System.out.println("Enter number of trainers::");
	}
}
