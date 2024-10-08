/*Create an interface named Vehicle with the following methods:
 void start();
 void stop();
Add a default method void show() that prints &quot;Showing the Vehicle&quot;. Implement two classes,
Car and Bike, that implement the Vehicle interface. Override the start and stop methods to
print relevant messages.*/

interface Vehicle{
    void start();
    void stop();
    default void show(){
        System.out.println("Showing the vehicle.");
    }
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting.");
    }
    @Override
    public void stop(){
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is starting.");
    }
    @Override
    public void stop(){
        System.out.println("Bike is stopping.");
    }
}

public class Main{
    public static void main(String[] args) {
        Vehicle V1 = new Car();
        Vehicle V2 = new Bike();
        V1.show();
        V1.start();
        V1.stop();
        V2.show();
        V2.start();
        V2.stop();
    }
}
