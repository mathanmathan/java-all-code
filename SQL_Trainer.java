class SQL_Trainer extends Trainer{

    // main method
    public static void main(String[] args)
    {

        Trainer trainerkumar = new Trainer("CSE","Payilagam");
        
        // instance name ram
        SQL_Trainer ram = new SQL_Trainer();
        ram.training();
        int salary =ram.getSalary();
        System.out.println("Salary:"+ salary);
       
    }

}
