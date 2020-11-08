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

    	System.out.println(zip(a, b)); //testing zip
	}

	// 11/5 classwork & homework 
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

	public static SuperArray zip(SuperArray a, SuperArray b) { //merge arrays
		SuperArray larger = a;
		SuperArray smaller = b;
		if(b.size() > a.size()) {
			larger = b;
			smaller = a;
		}
		SuperArray merged = new SuperArray(larger.size());
		for(int i = 0; i < larger.size(); i++) {
			if(i < a.size()) merged.add(a.get(i));
			if(i < b.size()) merged.add(b.get(i));
		}
		return merged;
	}
}