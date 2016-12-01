class Dog extends Animal{
	
	void bark(){
		System.out.println("Ruff! Ruff!");
	}
	
	boolean isBigger(Dog newDog){
		if(newDog.getSize()>this.getSize()){
			return false;
		}
		else{
			return true;
		}
	}
}