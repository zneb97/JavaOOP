class Dog extends Animal{
	
	public void bark(){
		System.out.println("Ruff! Ruff!");
	}
	
	public boolean isBigger(Dog newDog){
		if(newDog.getSize()>this.getSize()){
			return false;
		}
		else{
			return true;
		}
	}
}