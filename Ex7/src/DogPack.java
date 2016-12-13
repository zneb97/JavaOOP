/*
 * A class to create easy management of a large amount of dogs
 * using an array.
 * 
 * @author Ben Ziemann
 */
import java.util.*;

public class DogPack {
	private ArrayList<Dog> dogs;
	
	
	/*
	 * Create the dogpack array
	 */
	public void makeArray(int size){
		dogs  = new ArrayList<Dog>(size);
	}
	
	/*
	 * Add a dog to the dogpack array
	 */
	public void addDog(int index, Dog dog){
		dogs.add(index, dog);
	}
	
	/*
	 * Returns the largest dog in the current array
	 */
	public Dog biggestDog(){
		int largest = 0;
		for(int i = 1; i<dogs.size(); i++){
			if(dogs.get(i-1).isBigger(dogs.get(i))){
				if(dogs.get(i-1).isBigger(dogs.get(largest))){
					largest = (i-1);
				}
			}
		}
		
		return dogs.get(largest);
	}
}
