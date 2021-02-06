package week9;
public class Person {
   String name;
   int bornYear;

   public Person(String name, int bornYear){
       this.name = name;
       this.bornYear = bornYear;
   }
   public void introduce(){
       System.out.print(" My name is " + name);
       System.out.println(" I was born in " + bornYear);
   }
}
class Sheriff extends Person{
    String workState;
    public Sheriff(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }
    // overiding method
    public void introduce(){
        super.introduce();
        System.out.println(" I am a Sheriff and Work at " + workState);
    }
}
class Teacher extends Person{
    String university;
    public Teacher(String name, int bornYear,String university){
        super(name, bornYear);
        this.university = university;
    }
    // overiding mehod
    public void introduce(){
        super.introduce();
        System.out.println(" I'm a teacher and teach the students in " + university);
    }
}
class PrimeMinister extends Person{
    String country;
    public PrimeMinister(String name, int bornYear, String country){
        super(name, bornYear);
        this.country = country;
    }
    // overiding method
    public void introduce(){
        super.introduce();
        System.out.println(" I'm a prime minister and work in " + country);
    }
}
class Footballer extends Person{
    String club;
    public Footballer(String name, int bornYear, String club){
        super(name,bornYear);
        this.club = club;
    }
    // overiding method
    public void introduce(){
        super.introduce();
        System.out.println(" I'm a football player and work in " + club);
    }
}
class Worker extends Person{
    String company;
    public Worker(String name, int bornYear, String company){
        super(name,bornYear);
        System.out.println(" I'm worker and I work in " + company);
    }
}