package GSC;

public class dogsMain {
    public static void main(String[] args) {
        //Creating a new object with constructor
        dogs dogOne = new dogs("Terror", "Sheep Dog");
        dogOne.dogDisplay();
        //Creating a new object with setters
        dogOne.setBreed("Puger");
        dogOne.setName("Pug");
        dogOne.dogDisplay();



    }
}
