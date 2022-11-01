class SupersubMethod extends SuperMethod{

 void message()
    {
        System.out.println("This is student class");
    }

void display()
    {
        
        message();
        super.message();
    }

public static void main(String[] args)
    {
        SupersubMethod sm = new SupersubMethod();
 
        // calling display() of SupersubMethod
        sm.display();
    }
}
