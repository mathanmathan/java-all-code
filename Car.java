abstract class Car{

abstract void accelerate();
abstract void applyBreak();

    Car(){ // allowed constructor
            System.out.println("Car Constructor");
    }

    public static void main(String[] args)
    { // main method allowed
       // Car c = new Car();          // cannot be create object in abstract class
    }
        void fixairBag()
            {
                System.out.println("Air bag");
            }
}
