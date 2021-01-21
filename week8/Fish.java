package week8;

public class Fish extends Pet {
    String size;
    double speed;
    double normalSpeed = 7; // clown fish can swin 7 cm per second


    public Fish ( String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this. color = color;
        this.age =  age;

    }
    public String getsize(){
        return size;
    }
    public void setSize(String newSize){
        this.size = newSize;
    }

    boolean saltWater = true;
    boolean freshWater = false;
    public void isSwinToSea(){
        if(saltWater != freshWater)
        System.out.println(" swim to the sea: " + saltWater);
    }
    public void swimFast(){
       if(speed < normalSpeed) {
        System.out.println(name + " size is " + size);
       System.out.println( name + " is a fast swin fish");
       }
    }
}
