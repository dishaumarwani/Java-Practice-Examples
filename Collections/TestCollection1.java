import java.util.*;
class TestCollection1{
	public static void main(String args[]){
		List<String> ar = new ArrayList<>();
		ar.add("John");
		ar.add("Marta");
		ar.add("Simpson");
		ar.add("Kohl");
		Iterator itr = ar.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}