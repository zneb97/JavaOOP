/*
 * Test class for the various animal related classes involved
 * in Olin's Java OOP IS class.
 * 
 * @author Ben Ziemann
 */

class DogTestDrive{
	public static void main (String[] args){
		Dog[] dogs = new Dog[3];
		
		Dog d1 = new Dog(100, "Newfie", "Tonka");
		d1.setBreed("Newfie");
		d1.setName("Tonka");
		d1.setSize(100);
		dogs[0]=d1;

		Dog d2 = new Dog(80, "Husky", "Tank");
		dogs[1]=d2;
		
		Dog d3 = new Dog(90, "Mastiff", "Troll");
		dogs[2]=d3;
		
		Cat c1 = new Cat(20, "Persian", "Slash");

		
		
		//Ex 3&4 Dog Pack
		int[] sizes = new int[5];
		DogPack pack1 = new DogPack();
		pack1.makeArray(sizes.length);
		
		for(int q=0; q<sizes.length; q++){
			d3.setSize(2*q + 20);
			pack1.addDog(q, d3);
		}
		
		System.out.println(pack1.biggestDog().getName());
		//
		
		//Ex2
		int biggest = 0;
		for(int i = 0; i < dogs.length; i++){
			System.out.print(dogs[i].getName() + " says ");
			dogs[i].makeNoise();
			if(dogs[i].getSize() > dogs[biggest].getSize()){
				biggest = i;
			}
		}
		//
		
		
		System.out.println(dogs[biggest].getName() + " is the largest.");
		
		System.out.println(d1.getName() + " is bigger than " + d2.getName() + ": " + d1.isBigger(d2));
		
		//Ex5
		System.out.println(c1.getName() + " is bigger than " + d2.getName() + ": " + c1.isBigger(d2));
		
		System.out.println(d1.fetch("go get it"));
		
		Fetcher F = new Dog();
		System.out.println(F.fetch("interface test"));
	}
}