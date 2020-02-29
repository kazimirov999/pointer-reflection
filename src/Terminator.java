public class Terminator extends Machines implements SkyNet {
    private String model;
    private boolean ammoLaser = false;
    private boolean ammoRocket = false;
    private boolean ammoMachineGun = false;
    private final String terminatorSay = "I need your clothes, boots and your motorcycle.";

    Terminator() {
        this.model = "T-1000";
    }

    public Object barSituation() {
        System.out.println("Terminator:");
        System.out.println(terminatorSay);
        System.out.println("Cigar Biker:\n" +
                "You forgot to say please.");
        System.out.println("__________________________________");
        return new Bike("Harley Davidson");
    }

    public void getAmmo() {
        System.out.println("Try to Activation ammunition....");
        ammoLaser = true;
        ammoRocket = true;
        ammoMachineGun = true;
        System.out.println("Ammunition is active!");
        System.out.println("ammoLaser: " + ammoLaser);
        System.out.println("ammoRocket: " + ammoRocket);
        System.out.println("ammoMachineGun: " + ammoMachineGun);
        System.out.println("__________________________________");

    }

    @Override
    public boolean standBy() {
        System.out.println("Terminator is on, and connect to SkyNet");
        return true;
    }
}
