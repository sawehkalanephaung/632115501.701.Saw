package week7;
/**
 * Author: Ehkalane Phaung
 * Date: 18/01/2021
 */
public class Pet {
    // assign variables
    String name;
    String species;
    int age;
    String color;

    public Pet(){

    }
    // construtor
    public Pet(String name, String species, String color, int age){
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }
    // display pet data
    public void intro(){
        System.out.println(" Name: " + name + " Species: " + species + " Color: " + color + " Age: " + age);
    }
    
}
