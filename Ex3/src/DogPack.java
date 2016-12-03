/*
 * A class to create easy management of a large amount of dogs
 * using an array.
 * 
 * @author Ben Ziemann
 */
public class DogPack {
	Dog[] dogs;
	
	/*
	 * Create the dogpack array
	 */
	public void makeArray(int size){
		dogs = new Dog[size];
	}
	
	/*
	 * Add a dog to the dogpack array
	 */
	public void addDog(int index, Dog dog){
		dogs[index] = dog;
	}
	
	/*
	 * Returns the largest dog in the current array
	 */
	public Dog biggestDog(){
		int largest = 0;
		for(int i = 1; i<dogs.length; i++){
			if(dogs[i-1].isBigger(dogs[i])){
				largest = (i-1);
			}
			else largest = i;
		}
		
		return dogs[largest];
	}
}
