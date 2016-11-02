class DogTestDrive{
	public static void main (String[] args){
		Dog[] dogs = new Dog[3];
		
		Dog d1 = new Dog();
		d1.breed="Newfie";
		d1.name="Tonka";
		d1.size = 100;
		dogs[0]=d1;
		
		Dog d2 = new Dog();
		d2.breed="Husky";
		d2.name="Tank";
		d2.size=80;
		dogs[1]=d2;
		
		Dog d3 = new Dog();
		d3.breed="Mastiff";
		d3.name="Troll";
		d3.size=90;
		dogs[2]=d3;
		
		int biggest = 0;
		for(int i = 0; i < dogs.length; i++){
			System.out.print(dogs[i].name + " says ");
			dogs[i].bark();
			if(dogs[i].size > dogs[biggest].size){
				biggest = i;
			}
		}
		
		System.out.print(dogs[biggest].name + " is the largest.");
	}
}