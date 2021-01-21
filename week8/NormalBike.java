package week8;
public class NormalBike extends Bike {
    int newSpeed = 0;
    int currentSpeed; // current speed ca be set
    int useBreak; // if use break speed will go down 5
    int speedUp; // speed will in crease 5 if speed up

    public NormalBike(int currentSpeed, int useBreak, int speedUp){
        this.currentSpeed = currentSpeed;
        this.useBreak = useBreak;
        this.speedUp = speedUp;
    }
    public void setCurrentSpeed(int newCurrentSpeed){
        currentSpeed = newCurrentSpeed;
    }
    public void isApplySpeed(){
        if(currentSpeed > speedUp)
        newSpeed = currentSpeed + speedUp;
        System.out.println(" The new speed will increase after speed up is " + newSpeed);
    }
    public void isApplyBreak(){
        if(currentSpeed > useBreak)
        newSpeed = currentSpeed - useBreak;
        System.out.println(" The new speed will decrease after break is " + newSpeed);
    }
   
}
