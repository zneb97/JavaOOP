abstract class Animal{
	private int size;
	private String breed;
	private String name;
	
	public Animal(){
		System.out.println("Animal Created");
	}
	
	public Animal(int size, String breed, String name){
		System.out.println("Animal Created");
		this.size = size;
		this.breed = breed;
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int s){
		size = s;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String b){
		breed =b;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void makeNoise(){
		System.out.println("Grunt");
	}
	
	public boolean isBigger(Animal second){
		if(second.getSize()>this.getSize()){
			return false;
		}
		else{
			return true;
		}
	}
}