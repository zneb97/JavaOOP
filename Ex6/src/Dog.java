class Dog extends Animal implements Fetcher{
	
	public void makeNoise(){
		System.out.println("Woof");
	}
	
	public String fetch(String phrase){
		String prepend = "damp ";
		prepend = prepend + phrase;
		return prepend;
	}
}