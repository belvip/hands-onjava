package car.example.constructor.injection;

public class Car {
    // Car class depend on Specification class
    private Specification specification;

    // Provide the dependencies to the dependent class (Car) through it constructor
    public Car(Specification specification) {
        this.specification = specification;
    }

    public  void displayDetails(){
        System.out.println("Car Details : " + specification.toString());
    }
}
