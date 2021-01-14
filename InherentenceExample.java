package week6;

public class InherentenceExample {
    public static void main(String[] args) {
        Artist art = new Artist(" Ball ", 20);

        art.genre = " Hip Hop ";
        art.gender = " Male ";
        art.introduce();
        art.playMusic();
        System.out.println();

        Dancer d = new Dancer("Jelly", " Female ", 19);
        d.dance = " Street ";
        d.introduce();
        d.danceSyle();
        System.out.println();

        Teacher t = new Teacher(" David Htoo", " Male ", 21);
        t.teach = " Language Art ";
        t.introduce();
        t.teaching();
        System.out.println();

        Actor a = new Actor(" The Rock ", " Male ", 40);
        a.genre = " Action Movie ";
        a.introduce();
        a.actTpye();
        System.out.println();

        Photographer p = new Photographer(" Max ", " Male ", 30);
        p.type = " Landscape ";
        p.introduce();
        p.photoStyle();
        System.out.println();

        Driver dri = new Driver(" Joneson ", " Male ", 27);
        dri.typeDriver = " Grab ";
        dri.introduce();
        dri.carDriver();
        
     }
    }
 
