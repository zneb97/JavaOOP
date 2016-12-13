class Cat extends Animal{
	
	public Cat(int size, String breed, String name){
		super(size, breed,name);
		System.out.println("Cat Created");
	}
	
	public Cat(){
		System.out.println("Cat Created");
	}
	
	public void makeNoise(){
		System.out.println("Meow");
	}
}
