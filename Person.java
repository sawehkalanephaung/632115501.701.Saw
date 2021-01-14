package week6;
public class Person {
    String name;
    int age;
    String gender;
    // create constructor
    public Person(){
    }
    // assign another constructor with objects 
    public Person( String name, int age, String gender){
        this.name = name;
        this. age = age;
        this.gender = gender;
    }
    // assign introduce method
    public void introduce(){
        System.out.println(" My name is " + name + ", age is " + age + " and gender is " + gender);

    }
}
