class Trainer{
    
    // instance variable
    String dept ="java";
    String institute ="Payilagam";

    // private instance variable
    private int salary =10000 ;
    
    // Consturctor
    Trainer(){
        System.out.println("Create Constructor");
    }
    
    Trainer(String cse,String payilagam)
    {
        String Cse=cse;
        String Payilagam =payilagam;
        System.out.println("Tainer Constructor print args:" +Cse+" and " +Payilagam);
    }
    // getter method
    int getSalary()
    {
        return this.salary;
    }

    // method
    void training()
    {   
        
        System.out.println("Department "+this.dept+ " and Institue "+this.institute);
    }
}
