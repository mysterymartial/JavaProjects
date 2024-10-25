import java.util.Scanner;
import java.util.*;

public class Collection{

	public static void main(String...args){

	Scanner sc= new Scanner(System.in);

	Stack <String> stack = new Stack<String>();

	stack.push ("coaster");
	stack.push ("milk");
	stack.push ("tea");
	stack.push ("indomie");
	
	stack.pop();
	Iterator <String> time = stack.iterator();

	while(time.hasNext()){


		System.out.println(time.next());




}


}


}