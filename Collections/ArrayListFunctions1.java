import java.util.*;
class ArrayListFunctions1{
	public static void main(String args[]){
		List<String> ar = new ArrayList<>(20);
		ar.add("John");
		ar.add("Marta");
		ar.add("Simpson");
		ar.add("Kohl");
		System.out.println("Initial List");
		for(String obj: ar){
			System.out.println("\t"+obj);
		/*
		It is used to insert the specified 
		element at the specified position 
		index in a list.
		*/
		}
		System.out.println("\nUpdated List");
		ar.add(2, "Rumi");
		/*
		Shifting operations are expensive 
		and so have high time complexity*/
		for(String obj: ar){
			System.out.println("\t"+obj);
		}
		
		System.out.println("\nLast index of Rumi in array is: " + ar.lastIndexOf("Rumi"));
		
		List<String> continent = new ArrayList<>();
		continent.add("Asia");
		continent.add("Antartica");
		continent.add("North America");
		continent.add("South Africa");
		
		/*
		Adding elements of one collection to another
		*/
		ar.addAll(5, continent);
		System.out.println("List after adding a new list:");
		for(String obj: ar){
			System.out.println("\t"+obj);
		}
		ar.add(5,"Rumi");
		ar.add(7,"Rumi");
		/*
		 return the index in this list of the first occurrence 
		 of the specified element
		*/
		System.out.println("\nFirst occurrence of Rumi is at index : \t" + ar.indexOf("Rumi"));
		/*
		 return the index in this list of the last occurrence 
		 of the specified element, or -1 if the list does not contain this element.
		*/
		System.out.println("\nLast occurrence of Rumi is at index: \t" + ar.lastIndexOf("Rumi"));
		System.out.println("\nUpdated Array");
		System.out.println("\t"+ ar);
	}
}