class Programming_Basic{

    public static void main(String[] args){

    Programming_Basic pb = new Programming_Basic();
    pb.calculate_amount();

    }
     void calculate_amount()
    {
       int amount = 0; 
        int day = 1; 
        while(day<=10)
        {
        amount = amount + day; 
        day = day +1;
        }
        System.out.println(amount); 
        }
        
}



