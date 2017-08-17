import java.util.*;
class TestCollection2{
	public static void main(String args[]){
		List<String> ar = new ArrayList<>();
		ar.add("John");
		ar.add("Marta");
		ar.add("Simpson");
		ar.add("Kohl");
		for(String obj: ar){
			System.out.println(obj);
		}
	}

}