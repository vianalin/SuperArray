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
		a.add("good morning"); //5
		a.add("!");
		a.add("bonjour");
		a.add("hey");
		a.add("konnichiwa");
		a.add("ola");
		a.add("salut");
		System.out.println(a.size()); //testing resize

		System.out.println(a.set(1, "what's up")); //hi
		System.out.println(a.get(1)); //testing set

		//classwork
		System.out.println(a.isEmpty()); //testing isempty false
		System.out.println(b.isEmpty()); //testing isempty true
	}
}