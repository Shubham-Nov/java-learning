package learning;

import java.util.HashMap;

public class Dog {
	private static HashMap<String, Dog> dogs = new HashMap<>();
	private String name;
	private String code;
	private String breed;
	
	public Dog (String code) {
        	this.code = code;
        	dogs.put(code, this);   // automatically register itself
    	}
    	
    	// Setters
    	public void setName (String name) {
        	this.name = name;
    	}

    	public void setBreed (String breed) {
        	this.breed = breed;
    	}
    	
    	// Getters
    	public String getName () {
        	return name;
    	}

    	public String getBreed () {
        	return breed;
    	}

    	public String getCode () {
        	return code;
    	}
	
	public static Dog getDogByCode (String code) {
		return dogs.get(code);
	}
}
