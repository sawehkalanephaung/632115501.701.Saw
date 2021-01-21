package week8;
public class MountainBike extends Bike {
    int newSpeed = 0;
    int currentSpeed; // current speed ca be set
    int useBreak; // if use break speed will go down 5
    int speedUp; // speed will in crease 5 if speed up
    int currentGear = 0;

    public MountainBike(int currentSpeed, int useBreak, int speedUp){
        this.currentSpeed = currentSpeed;
        this.useBreak = useBreak;
        this.speedUp = speedUp;
    }
    public void setCurrentSpeed(int newCurrentSpeed){
        currentSpeed = newCurrentSpeed;
    }
    public int getCurrentGear(){
        return currentGear;
    }
    public void setCurrentGear( int newCurrentGear){
        currentGear = newCurrentGear;
    }
    public void isApplySpeed(){
        if(currentSpeed > speedUp && currentSpeed > currentGear)
        newSpeed = currentSpeed + speedUp * currentGear;
        System.out.println(" The new speed will increase after apply  is " + newSpeed);
    }
    public void isApplyBreak(){
        if(currentSpeed > useBreak)
        newSpeed = currentSpeed - useBreak; // gear not effect break process
        System.out.println(" The new speed  will decrease after use break is " + newSpeed);
    }

}
