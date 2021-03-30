package lab8.lab82;

public class MainPet {
   public static void main(String[] args) {
       Dog d = new Dog("Lucky", "Booddle", "Brown ", 2);
       d.size = " Small ";
       d.intro();
       d.isBark();
       d.isRun();
       d.isShortHair();
       System.out.println();

       Fish f = new Fish(" Mai ", " Ocellaris", " Orange and white", 1);
       f.size = " Small ";
       f.intro();
       f.swimFast();
       f.isSwinToSea();
       System.out.println();

       Bird b = new Bird(" Ki Ki ", " Turquoise-fronted amazon ", " yellow and green ", 3);
       b.intro();
       b.checkCountry();
       b.birdType = " Parrot ";
       b.Speak();
       b.isCanFly();
       

   }
}
