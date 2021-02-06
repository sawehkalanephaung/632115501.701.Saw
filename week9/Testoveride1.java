package week9;

public class Testoveride1 {
   public static void main(String[] args) {
       Person person1, person2, person3, person4,person5, person6;
       person1 = new Person(" Mark ", 2001);
       person1.introduce();
       person2 = new Sheriff("Mateo", 1998, "California");
       person2.introduce();
       person3 = new Teacher(" Ball ", 1977, " CMU");
       person3.introduce();
       person4 = new PrimeMinister("Tu", 1954, "Thailand");
       person4.introduce();
       person5 = new Footballer("Messi", 1987, " Barcelona football club");
       person5.introduce();
       person6 = new Worker("Jackie", 1995, " apple company");
       person6.introduce();
   }
}
