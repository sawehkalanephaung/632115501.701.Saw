package lab11;
public class StudentData {
    //test case code
    public static void main(String[]args)
    {
    Student std01 = new Student("Mark",18,4.00); 
    Student std02 = new Student("Jane",18,2.20);
    Student std03 = new Student("Peter",19,4.00);
    Student std04 = new Student("Mark",22,1.75);
    //name
        System.out.println(" st01 = sto02: "+std01.Name.equals(std02.Name));
        System.out.println(" st01 = sto03: "+std01.Name.equals(std03.Name));
        System.out.println(" st02 = sto04: "+std02.Name.equals(std04.Name));
        System.out.println(" st01 = sto04: "+std01.Name.equals(std04.Name));
        //age
        System.out.println(" st01 = sto02: "+std01.Age.equals(std02.Age));
        System.out.println(" st03 = sto04: "+std03.Age.equals(std04.Age));
        System.out.println(" st01 = sto03: "+std01.Age.equals(std03.Age));
        //GPA
        System.out.println(" st01 = sto03: "+std01.GPA.equals(std03.GPA));
        System.out.println(" st02 = sto04: "+std02.GPA.equals(std04.GPA));
        System.out.println(" st02 = sto03: "+std02.GPA.equals(std03.GPA));
    }
    
 }
