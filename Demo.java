public class Demo {
	public static void main(String[] args) {
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