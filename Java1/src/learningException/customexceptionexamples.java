package learningException;
import java.util.*;
public class customexceptionexamples {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter age");
try {
	int age=sc.nextInt();
	if(age<=21) {
		throw new underageException("age is underage");
	}
	else {
		System.out.println("Shows profiles");
	}
}
catch (underageException u) {
	System.out.println("exception occured but it is handled"+u);
}
	}

}

class underageException extends Exception{
	String errorMessage;
	underageException(String errorMessage){
		this.errorMessage=errorMessage;
		return;
	}
}
