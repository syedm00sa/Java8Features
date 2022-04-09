package sid.java8.stream;

import java.util.ArrayList;

public class CollectionVsStream {
	public static void main(String [] ar) {
		ArrayList<String> names= new ArrayList<>();
		names.add("allan");
		names.add("Paul");
		names.add("Dom");

		names.remove(2);
		System.out.println(names);
	}
}
