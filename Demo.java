public class Demo {
	public static void main(String[] args) {
		SuperArray words = new SuperArray(); 
    	words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    	words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    	words.add("una");    words.add("ebi");     words.add("toro"); 
    	System.out.println(words);
    	removeDuplicates(words);
    	System.out.println(words); //testing remove dup

    	SuperArray a = new SuperArray();
    	a.add("9");		a.add("1");		a.add("2");		a.add("2");		a.add("3");		a.add("4");
    	SuperArray b = new SuperArray();
    	b.add("0");		b.add("4");		b.add("2");		b.add("2");		b.add("9");
    	System.out.println(findOverlap(a, b)); //testing findoverlap
	}

	// 11/5 classwork
	public static void removeDuplicates(SuperArray s) { //keep first occurence, remove rest of repetition
		for(int i = s.size() - 1; i > 0; i--) {
			if(s.indexOf(s.get(i)) != i) s.remove(i); 
		}
	}

	public static SuperArray findOverlap(SuperArray a, SuperArray b) { //find intersection of elements, no dup
		SuperArray overlap = new SuperArray(a.size());
		for(int i = 0; i < a.size(); i++) {
			if(b.contains(a.get(i))) overlap.add(a.get(i));
		}
		removeDuplicates(overlap);
		return overlap;
	}
}