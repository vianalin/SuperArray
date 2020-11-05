public class SuperArray {
	//a. instance variables
	private String[] data;
	private int size; //the current size

	//b. constructor
	public SuperArray() {
		size = 0;
		data = new String[10];
	}

	//methods
	public int size() { //c. returns number of elements in this list
		return size;
	}

	public void resize() { //g. increase capacity by creating a larger array & copying values into new one
		String[] resizedarr = new String[size * 2]; //+ 10 is too little, * 2 better
		for(int i = 0; i < size; i++) {
			resizedarr[i] = data[i];
		}
		data = resizedarr;
	}

	public boolean add(String element) { //d. appends the specified element to the end of this list
		if(data.length == size) resize();
		data[size] = element; 
		size++; 
		return true;
	}

	public String get(int index) { //e. return element at the specified position in list
		return data[index];

	}
	public String set(int index, String element) { //f. replaces element at specified pos with specified element. return value you replaced
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}

	//11/3 class 
	public boolean isEmpty() { //returns true if list contains no elements
		return(size() == 0);
	}

	public void clear() { //reset size to 0, no ref to old value in array
		data = new String[10];
		size = 0;
	}

	public String toString() { //format:"[e0, e1.. eN]" where size = N + 1, only displays elements that were added 
		if(size() == 0) return "[]";
		String result = "[";
		for(int i = 0; i < size() - 1; i++) {
			result += data[i] + ", ";
		}
		result = result + data[size() - 1] + "]";
		return result;
	}

	public boolean contains(String s) {
		boolean result = false;
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(s)) result = true;
		}
		return result;
	}
}