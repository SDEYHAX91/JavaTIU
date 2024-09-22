/*Design a Vehicle base class with a method drive(). Derive classes Car, Bike,
and Truck from Vehicle. Override the drive() method in each derived class to
simulate different driving behaviors.*/

class Vehicle {
        public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The car is driving smoothly on the highway.");
    }
}
class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The bike is zipping through the city streets.");
    }
}
class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The truck is hauling heavy loads on rugged terrain.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myCar.drive();
        myBike.drive();
        myTruck.drive(); 
    }
}
