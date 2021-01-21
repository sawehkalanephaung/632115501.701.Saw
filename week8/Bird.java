package week8;
public class Bird  extends Pet{
    String birdType;
    String country;
    String fly;
    public Bird ( String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this. color = color;
        this.age =  age;
    }
    public void checkCountry(){
       System.out.println( name + " from Thailand ");
    }
    public void checkBirdType(){
        System.out.println(name + " is " +birdType);
    }

    boolean canFly = true;
    boolean cannotFly = false;
    public void isCanFly(){
        if(canFly != cannotFly)
        System.out.println(" Bird can fly :" + canFly); // 

    }
   public void Speak(){
       System.out.println(" Yes " + name + " can speak");

   }
  
}
