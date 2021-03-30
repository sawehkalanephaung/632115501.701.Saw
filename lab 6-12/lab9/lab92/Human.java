package lab9.lab92;

public class Human{
   public void hit ( Animal animal){
       System.out.println(animal.roar());
   }
   public static void main(String[] args) {
       Animal dog = new Dog(); // questio 1
       Human human = new Human();
       Human person = new Human(); // update the main method of Person
       System.out.println(" The first calling hit ( Animal)");
       human.hit(dog); // Quetion 2

      dog = new Cat();
       System.out.println( " The second calling hit ( Animal )");
       human.hit(dog);// Question 3

       dog = new Fish();
       System.out.println(" The Third calling hit ( Animal ");
       person.hit(dog);
   }
}

