class Dog extends Animal implements Fetcher{
	
	public Dog(){
		System.out.println("Dog Created");
	}
	
	public Dog(int size, String breed, String name){
		super(size, breed,name);
		System.out.println("Dog Created");
	}
	
	public void makeNoise(){
		System.out.println("Woof");
	}
	
	public String fetch(String phrase){
		String prepend = "damp ";
		prepend = prepend + phrase;
		return prepend;
	}
}