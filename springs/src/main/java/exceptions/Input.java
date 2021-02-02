package exceptions;


import java.util.Scanner;

public class Input  {
	
	
	private Process pro;
	
	
	public static void input() throws BusinessException {
		System.out.println("Entering into Input  ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		Process.process(age,id);
		
		System.out.println("Ending from Input  ");

		
	}
	
	
	public Process getPro() {
		return pro;
	}

	public void setPro(Process pro) {
		this.pro = pro;
	}



}
