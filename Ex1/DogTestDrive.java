class DogTestDrive{
	public static void main (String[] args){
		Dog d = new Dog();
		d.size=40;
		d.bark();
		
		Cat c = new Cat();
		c.breed = "Maine Coon";
		c.bark();
	}
}
class Animal{
	int size;
	String breed;
	String name;
}

class Dog extends Animal{	
	void bark(){
		System.out.println("Ruff! Ruff!");
	}
}

class Cat extends Animal{
	void bark(){
		System.out.println("I'm a cat.");
	}
}
