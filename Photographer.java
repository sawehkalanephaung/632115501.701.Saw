package week6;
public class Photographer extends Person{
    String type;

    public Photographer( String name, String gender, int age){
        this.name =name;
        this.age = age;
        this.gender = gender;
    }
    public void photoStyle(){
        System.out.println( name + " is a " + type + " photographer " );
    }

    
}
