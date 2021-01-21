package week8;

public class Dog  extends Pet {
    String size;
    String run;
    String bark;
    String petType;

    public Dog ( String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this. color = color;
        this.age =  age;
    }
   
    public String getSize(){
        return size;
    }
    
    public void setPetType(String newPetType){
       petType = newPetType;
       System.out.println(" my dog ");
    }
    public void isBark(){
        System.out.println(size + " bark Box Box !!! ");
    }
    public void isRun(){
        System.out.println(" my dog " + name + " is run to the jungle ");
        
    }
	boolean shortHair = true;
    boolean longHair = false;
    public void isShortHair(){
        if(shortHair != longHair)
        System.out.println(" Short hair: " + shortHair);
    }
  
   
}
