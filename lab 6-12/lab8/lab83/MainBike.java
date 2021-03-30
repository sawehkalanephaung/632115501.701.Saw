package lab8.lab83;

public class MainBike {
   public static void main(String[] args) {
       NormalBike b = new NormalBike(10, 5, 5);
       b.setType(" Normal Bike");
       b.introBike();
       b.isApplySpeed();
       b.isApplyBreak();
       System.out.println();

       MountainBike mb = new MountainBike(10, 5, 5);
       mb.setType(" Mountain Bike ");
       mb.setCurrentGear(2);
       mb.introBike();
       mb.isApplySpeed();
       mb.isApplyBreak();
       System.out.println();
   }
}
