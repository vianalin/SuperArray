public class Tester {
	public static void main(String[] args) {
		SuperArray a = new SuperArray();
		SuperArray b = new SuperArray();
		
		System.out.println(a.size()); //testing size

		a.add("hello");
		a.add("hi");
		System.out.println(a.size());

		System.out.println(a.set(1, "what's up")); //hi
		System.out.println(a.get(1)); //testing set

		//classwork
		System.out.println(a.isEmpty()); //testing isempty
		System.out.println(b.isEmpty());
	}
}