import java.util.ArrayList;
public class Arraylistplay{

	public static void main(String...args){

	ArrayList <String> friut = new ArrayList <>();

	friut.add("mango");
	friut.add("pawpaw");
	friut.add("apple");
	friut.set(0, "lemon");
	friut.remove("pawpaw");
	//for(String select : friut){

	//System.out.println(select);
	
//}

	System.out.println(friut.size());
}


}