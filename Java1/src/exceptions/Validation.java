package exceptions;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		String msg = process(id,age);
		if(msg.contentEquals("valid")) {
			System.out.println("prog success");	
		}else {
			System.out.println(msg);
		}

	}

	public static String process(int id,int age) {
		System.out.println("inside process - enter");

		String msg = validate(id,age);
		if("Age is invalid".contentEquals(msg)) {
			return msg;
		}
		
		if("ID is invalid".contentEquals(msg)) {
			return msg;
		}
		
		System.out.println("inside process - exit");
		return "valid";
	}

	public static String validate(int id,int age) {
		System.out.println("inside validate - enter");

		if (age < 18) {
			return "Age is invalid";
		}
		
		if (id < 0) {
			return "ID is invalid";
		}
        
		save(id, age);
		System.out.println("inside validate - exit");
		return "valid";
	}

	public static void save(int id,int age) {
		System.out.println("inside save - enter");
		System.out.println("id ,age saved");
		System.out.println("inside save - exit");

	}

}

