
public class Cat extends Pet{
	String cat_sound;
	public Cat(String petName) {
		super(petName);
		this.cat_sound = "meaow purrr bleh";
	}


	public String speak() {
		
		return cat_sound;
	}

}