package learning;

public class Main {
	public static void main (String[] args) {
		Dog A01 = new Dog("A01");
		
		A01.setName("Max");
		A01.setBreed("pomeranian");
		
		System.out.println(Dog.getDogByCode("A01").getName());
        	System.out.println(Dog.getDogByCode("A01").getBreed());
	}
}
