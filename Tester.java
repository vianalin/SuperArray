public class Tester {
	public static void main(String[] args) {
		SuperArray a = new SuperArray();
		System.out.println(a.size()); //testing size

		System.out.println(a.add("hello"));
		System.out.println(a.add("hi"));

		System.out.println(a.set(0, "what's up")); //hi
		System.out.println(a.get(0)); //testing set
	}
}