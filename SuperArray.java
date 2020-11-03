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
		int len = 0;
		for(int i = 0; i < size; i++) {
			if(data[i] != null) len++;
			else break;
		}
		return len;
	}

	public void resize() { //g. increase capacity by creating a larger array & copying values into new one
		String[] result = new String[size * 2];
		for(int i = 0; i < size; i++) {
			result[i] = data[i];
		}
		data = result;
		size = data.length;
	}

	public boolean add(String element) { //d. appends the specified element to the end of this list
		if(size() == size) {
			data[size()] = element;
			return true;
		}
		resize();
		return add(element);
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
		data = new String[0];
		size = 0;
	}

	public String toString() { //format:"[e0, e1.. eN]" where size = N + 1, only displays elements that were added 
		if(size() == 0) return "[]";
		String result = "[";
		for(int i = 0; i < size() - 1; i++) {
			result += data[i] + ", ";
		}
		result += data[size() - 1];
		return result;
	}

	public boolean contains(String s) {
		boolean result = false;
		for(int i = 0; i < data.length; i++) {
			if(s.equals(data[i])) result = true;
		}
		return result;
	}
}