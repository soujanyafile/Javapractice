package learningException;

import java.util.Scanner;

public class customlearningexception1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		try {
			int age=sc.nextInt();
			if(age<=21) {
				throw new underageException("error");
			}
			else {
				System.out.println("Shows profiles");
			}
		}
		catch (underageException u) {
			System.out.println("exception occured but it is handled "+u.getMessage());
		}
	}

}

class underageException extends Exception{
	public String errorMessage;
	public underageException(String errorMessage) {
		this.errorMessage=errorMessage;
	}


	public String getMessage() {
		return errorMessage;
	}
}


