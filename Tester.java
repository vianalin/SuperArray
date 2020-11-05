public class Tester {
	public static void main(String[] args) {
		SuperArray a = new SuperArray(); 
		SuperArray b = new SuperArray();
		
		System.out.println(a.size()); //testing size

		a.add("hello"); 
		a.add("hi");
		System.out.println(a.size()); //testing add & size

		a.add("hola");
		a.add("ni hao");
		a.add("good morning"); 
		a.add("!"); //5
		a.add("bonjour");
		a.add("hey");
		a.add("konnichiwa");
		a.add("ola");
		a.add("salut");
		System.out.println(a.size()); //testing resize

		System.out.println(a.set(5, "what's up")); //hi
		System.out.println(a.get(5)); //testing set

		// 11/3 classwork
		System.out.println(a.isEmpty()); //testing isempty false
		System.out.println(b.isEmpty()); //testing isempty true

		b.add("x");
		System.out.println(b.size());
		b.clear();
		System.out.println(b.size()); //testing clear

		System.out.println(b.toString()); //testing toString empty
		System.out.println(a.toString()); //testing toString regular

		System.out.println(a.contains("o")); //testing contains false
		System.out.println(b.contains("o")); //testing contains false
		System.out.println(a.contains("ola")); //testing contains true

		// 11/3 homework
		a.add(5, "sup!");
		System.out.println(a.toString()); //testing add void

		System.out.println(a.remove(5)); 
		System.out.println(a.toString()); //testing remove

		System.out.println(a.indexOf("lol")); //testing indexof -1
		System.out.println(a.indexOf("ola")); //testing indexof 

		System.out.println(a.toArray()); //testing toarray

		// 11/5 testing classwork
		SuperArray words = new SuperArray(); 
    	words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    	words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    	words.add("una");    words.add("ebi");     words.add("toro"); 
    	System.out.println(words);
    	removeDuplicates(words);
    	System.out.println(words); //testing remove dup

	}

	// 11/5 classwork
	public static void removeDuplicates(SuperArray s) { //keep first occurence, remove rest of repetition
		for(int i = s.size() - 1; i > 0; i--) {
			if(s.indexOf(s.get(i)) != i) s.remove(i); 
		}
	}
}