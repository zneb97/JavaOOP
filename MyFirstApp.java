/**
 *Ben Ziemann's first Olin Java program
 *Loops through numbers and prints whether they are odd or even.
 *
 *@Ben Ziemann
 */
public class MyFirstApp{
	public static void main (String[] args){
		System.out.println("I rule!");
		System.out.println("The World!");
		
		for(int i=1; i<10; i++){
			if(i%2==0){
				System.out.println(i + " is Even");
			}
			else{
				System.out.println(i + " is Odd");
			}
		}
	}
}