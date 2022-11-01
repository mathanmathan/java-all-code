class ActorSivakumar implements Actor{

    static String address="Coimbatore";
    
    // args constructor
    ActorSivakumar(int Age,String Car){
    int age=Age;
    String car=Car;
    System.out.println("Age:" +age+" and Car "+Car);
    }

    // zero constructor
    ActorSivakumar(){
     System.out.println("Zero args Constructor");
    }

    public static void main(String[] args)
    {
 
        ActorSivakumar as = new ActorSivakumar(65,"Audi car");
        
        as.act();
        as.dance();
        as.sing();
        as.speaking();
        System.out.println("Adress"+address);
        System.out.println("makeUpRequired "+makeUpRequired);

        Actor ac = new ActorSivakumar();
        ac.act();
        ac.dance();
        ac.sing();
        System.out.println("Actor siva kumar address "+ address);
    }
    public void act()
    {
        System.out.println("Best Actor Sivakumar");
    }

    public void dance()
    {
        System.out.println(" Actor Sivakumar son good dancer ");
    }

    public void sing()
    {
        System.out.println(" Actor Sivakumar is trying to sing");
    }
    void speaking()
    {
        System.out.println(" Actor Sivakumar has Spoken to English in meeting");
    }
    
}
