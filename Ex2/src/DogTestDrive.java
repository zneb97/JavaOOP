class DogTestDrive{
	public static void main (String[] args){
		Dog[] dogs = new Dog[3];
		
		Dog d1 = new Dog();
		d1.setBreed("Newfie");
		d1.setName("Tonka");
		d1.setSize(100);
		dogs[0]=d1;

		Dog d2 = new Dog();
		d2.setBreed("Husky");
		d2.setName("Tank");
		d2.setSize(80);
		dogs[1]=d2;
		
		Dog d3 = new Dog();
		d3.setBreed("Mastiff");
		d3.setName("Troll");
		d3.setSize(90);
		dogs[2]=d3;
		
		int biggest = 0;
		for(int i = 0; i < dogs.length; i++){
			System.out.print(dogs[i].getName() + " says ");
			dogs[i].bark();
			if(dogs[i].getSize() > dogs[biggest].getSize()){
				biggest = i;
			}
		}
		
		System.out.print(dogs[biggest].getName() + " is the largest.");
	}
}