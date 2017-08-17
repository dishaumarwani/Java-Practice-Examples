import java.util.*;
class TestCollection1{
	public static void main(String args[]){
		/* Syntax to create ArrayList in Java after Java 7 */
		List<String> ar = new ArrayList<>();
		/* Adding elements in ArrayList */
		ar.add("John");
		ar.add("Marta");
		ar.add("Simpson");
		ar.add("Kohl");
		/*iterate over a list by using Iterator Class*/
		Iterator itr = ar.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}