package lab7;
public class TestGun {
    public static void main(String[] args) {
        NerfGun gun1 = new NerfGun();
        gun1.fire();
        gun1.reload(15);
        gun1.fire();
        gun1.fire();
        gun1.displayNumberOfAmmunition();
        gun1.reload(2);
        gun1.displayNumberOfAmmunition();
        gun1.displayGunID();

        NerfGun gun2 = new NerfGun(15);
        gun2.displayGunID();
        gun2.fire();
        gun2.displayNumberOfAmmunition();
        gun2.reload(2);
        gun2.displayNumberOfAmmunition();
    }
}
