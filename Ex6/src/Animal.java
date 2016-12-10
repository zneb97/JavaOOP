class Animal{
	private int size;
	private String breed;
	private String name;
	
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