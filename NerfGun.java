package lab7;

public class NerfGun {

    // assign variables
    private int ammunition;
    private int gunID;

    // create construtor
    public NerfGun() {
        ammunition = 0;
        gunID = 1;
    }
    // assign another construtor with objects
    public NerfGun( int  bulletNum) {
        ammunition = bulletNum;
        gunID = 2;
    }
    // return relaod method and return ammunition value
    public double reload( int newRload) {
        // do a boolean 
        if (ammunition + newRload > 15) {
            System.out.println(" \n Error !! the ammunition is overload " );
            return ammunition;
        } else {
            ammunition = ammunition + newRload;
            return ammunition;
        }

    }
    // assign fire methos
    public void fire() {
        // do a boolean if statement
        if (ammunition < 1) {
            System.out.println(" \n There is no ammuition " );
        }else {
            System.out.println( " \n BANG !!!");
            ammunition--;
        }
    } 
    // print num of ammunition
    void displayNumberOfAmmunition() {
        System.out.println( " \n " + ammunition + " bullet left");
    }

    // print gun ID 
    void displayGunID() {
        System.out.println(" \n The ID of this gun is " + gunID);
    }

}

