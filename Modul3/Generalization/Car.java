public class Car extends Vehicle {
    private int numWheel = 4;
    Car() {
        System.out.println("Car is created");
    }
    public void drift() {
        System.out.println("Car is drifting");
    }
    public void honk(){
        System.out.println("Car is honking");
    }

    public int getNumWheels() {
    return numWheel;
    }
}
