import java.util.*;
public class AnimalPack {
	/*
	 * A class to create easy management of a large amount of animals
	 * using an array.
	 * 
	 * @author Ben Ziemann
	 */
		private ArrayList<Animal> animals;
			
		
		/*
		 * Create the animalpack arraylist
		 */
		public void makeArray(int size){
			animals  = new ArrayList<Animal>(size);
		}
		
		/*
		 * Add a animal to the animalpack array
		 */
		public void addAnimal(int index, Animal animal){
			animals.add(index, animal);
		}
		
		/*
		 * Returns the largest animal in the current array
		 */
		public Animal biggestAnimal(){
			int largest = 0;
			for(int i = 1; i<animals.size(); i++){
				if(animals.get(i-1).isBigger(animals.get(i))){
					if(animals.get(i-1).isBigger(animals.get(largest))){
						largest = (i-1);	
					}
				}
			}
			
			return animals.get(largest);
		
		}
		
		public void makeNoise(){
			for(int i = 0; i < animals.size(); i++){
				animals.get(i).makeNoise();
			}
		}

}
