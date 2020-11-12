public class SuperArray {
	// a. instance variables
	private String[] data;
	private int size; //the current size

	// b. constructor
	public SuperArray() { //size 0, starting capacity 10
		size = 0;
		data = new String[10];
	}

	// methods
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
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		return data[index];

	}
	public String set(int index, String element) { //f. replaces element at specified pos with specified element. return value you replaced
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}

	// 11/3 class 
	public SuperArray(int initialCapacity) { //superarray with provided starting capacity.
    	if(initialCapacity < 0) throw new IllegalArgumentException();
    	size = 0;
   		data = new String[initialCapacity];
  	}

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
		for(int i = 0; i < data.length; i++) {
			if(s.equals(data[i])) return true;
		}
		return false;
	}

	// 11/3 homework
	public void add(int index, String element) { //adding specified element to specified position, shift current and subsequent elements down to right
		if(index < 0 || index > size()) throw new IndexOutOfBoundsException();
		if(size() == size) resize();
		size++;

		for(int i = size(); i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
	}

	public String remove(int index) { //removes element from specified, shift subsequent elements to left, returned is removed element
		String removed = data[index];
		if(index >= size) return null;

		String[] newData = new String[data.length - 1];
		int count = 0;
		
		for(int i = 0; i < size; i++) {
			if(i != index) {
				newData[count] = data[i];
				count++;
			}
		}
		data = newData;
		size--;
		return removed;
	}

	public int indexOf(String s) { //return index of first occurrence of element, or -1 if list does not contain element
		for(int i = 0; i < size; i++) {
			if(s.equals(data[i])) return i;
		}
		return -1;
	}

	public String[] toArray() { //return array containing all element of list
		String[] array = new String[size];
		for(int i = 0; i < size; i++) {
			array[i] = data[i];
		}
		return array;
	}

	// 11/5 homework
	public int lastIndexOf(String value) { //c
		for(int i = size(); i >= 0; i--) {
			if(value.equals(data[i])) return i;
		}
		return -1;
	}

	public boolean equals(SuperArray other) { //d superarrays r equal if corresponding elements are equal
		if(size() != other.size()) return false;
		for(int i = 0; i < size; i++) {
			if(other.get(i).equals(data[i])) return true;
		}
		return false;
	}

}