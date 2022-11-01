class SuperCar extends SuperKeyword{

 int maxSpeed = 180;
 
    void display()
    {
        
        System.out.println(super.maxSpeed);
    }
public static void main(String[] args)
    {
        SuperCar car = new SuperCar();
        car.display();
    }

}
