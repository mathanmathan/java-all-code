public class Tester {
 
   private String message;
 
   public Tester(){
      message = "Hello World!";
   }
   public Tester(String message){
      this.message = message;
   }
 
   public String getMessage(){
      return message ;
   }
 
   public void setMessage(String message){
      this.message = message;
   }
 
   public static void main(String[] args) {
      Tester tester = new Tester();
      System.out.println(tester.getMessage());
   
      Tester tester1 = new Tester("Welcome");
      System.out.println(tester1.getMessage());  
   }
}   
