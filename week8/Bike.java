package week8;
/**
 * Author Soe
 * Date 21/01/2021
 * 
 */
public class Bike {
    int newSpeed = 0;
    int currentSpeed = 10; // current speed ca be set
    int useBreak = 5; // if use break speed will go down 5
    int speedUp = 5;//  speed will in crease 5 if speed up
    String type;

    public Bike(){

    }
    public Bike(int currentSpeed, int useBreak, int speedUp){
        this.currentSpeed = currentSpeed;
        this.useBreak = useBreak;
        this.speedUp = speedUp;
    }
    public String getType(){
        return type;
    }
    public void setType( String newType){
        type = newType;
    }
    public void introBike(){
        System.out.println( " \n " + type );
        System.out.println(" \n Current speed: " + currentSpeed + " apply speed: " + speedUp +  " use break: " + useBreak);
    }
}
