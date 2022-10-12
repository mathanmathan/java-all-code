public class ReturnExample {  
  
     int add()  
    {  
        int a=10;
        int b=10;
        int c=a+b;
        return c;  
    }  
    public static void main(String[] args) {  
    ReturnExample e =new ReturnExample();  
    int addvalue=e.add(); 
System.out.println("add value "+addvalue);
}  
  
}  
