package UsesHas;

public class Driver {
    private Car coupe;

    public Driver() {
        System.out.println("Driver is created.");
    }

    public void driving() {
    System.out.println("Driver is driving.");
    coupe = new Car();
    System.out.println("Using a car that has " + coupe.numWheel + " wheels.");
    }
}
