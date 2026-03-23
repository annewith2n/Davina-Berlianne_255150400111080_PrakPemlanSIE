public class Sedan extends Car {
    public int numDoors = 3;
    
    public void trunk() {
        System.out.println("Sedan is opening trunk");
    }
    public void honk() {
        super.honk();
        System.out.println("Sedan is honking");
    }
    public void showNumWheels() {
        System.out.println("Sedan has " + getNumWheels() + " Wheels");
    }
}
