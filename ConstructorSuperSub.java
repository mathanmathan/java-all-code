class ConstructorSuperSub extends SuperConstructor{

ConstructorSuperSub()
    {
        // invoke or call parent class constructor
        super();
 
        System.out.println("sub class Constructor");
    }
public static void main(String[] args)
    {
        ConstructorSuperSub css = new ConstructorSuperSub();
    }
}
