
public class AnimalPackTest {
	public static void main(String[] args){
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		d1.setSize(60);
		d1.setName("Dog 1");
		d2.setSize(50);
		d2.setName("Dog 2");
		d3.setSize(40);
		d3.setName("Dog 3");
		c1.setSize(30);
		c1.setName("Cat 1");
		c2.setSize(20);
		c2.setName("Cat 2");
		c3.setSize(10);
		c3.setName("Cat 3");
		
		AnimalPack pack1 = new AnimalPack();
		pack1.makeArray(0);
		pack1.addAnimal(0, d1);
		pack1.addAnimal(1, d2);
		pack1.addAnimal(2, d3);
		pack1.addAnimal(3, c1);
		pack1.addAnimal(4, c2);
		pack1.addAnimal(5, c3);
		
		System.out.println(pack1.biggestAnimal().getName());
		pack1.makeNoise();
		System.out.println(pack1.geoMean());
		System.out.println(AnimalPack.geoMean2(pack1));
		//Attempting to get instance variables of a static class results in non visible error
		
	}
}
