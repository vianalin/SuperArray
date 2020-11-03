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
}