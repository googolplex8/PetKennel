import java.util.ArrayList;
import java.util.List;

public class Kennel {
	private List<Pet> petList;
	
	/** For every Pet in the kennel, print the name followed by
	 * the result of a call to its speak method, one line per Pet
	 */
	public static void main(String[] args) {
		List <Pet> petList = new ArrayList <Pet>();
		Kennel kennel = new Kennel(petList);
		petList.add(new Cat("Cato"));
		petList.add(new Dog("Dogo"));
		kennel.allSpeak();
	}
	
	Kennel(List<Pet>petList){
		this.petList = petList;
	}

	public void allSpeak(){
		for(Pet x: petList){
			System.out.println(x.getName() + " " +  x.speak());
			x.speak();
		}
	}
	
	
}
