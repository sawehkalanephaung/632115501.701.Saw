package lab8.lab81;

public class Artist extends Person{
    String genre;

    public Artist ( String name,int age){
        this.name = name;
        this.age = age;
   }
   // assign play music method
   public void playMusic(){
       System.out.println( name + " is playing " + genre + " music ");
   }
}
