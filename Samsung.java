class Samsung extends FactorDemo{

    static int price = 5000;

    public static void main(String[] args){
    
        Samsung sam = new Samsung();
        sam.browse();
        System.out.println("Sam instance variable: "+ sam.price);
        sam.call(10);
        sam.sendMessage();
        sam.receivedCall();
        sam.verifyFingerPrint();
        sam.providePattern();
    }
    int call(int second){
     System.out.println("Samsung call Going "+second);
        return second;
   
    }
     void sendMessage(){
         System.out.println("Samsung Message send");
    }

     void receivedCall(){
         System.out.println("Samsung call Received");
    }

     void verifyFingerPrint(){
         System.out.println("Samsung succes verifyFingerPrint");
    }
    void providePattern(){
         System.out.println("Samsung pattern providePattern");
    }
}
