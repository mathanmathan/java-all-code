class Mobile extends Telephone{

int price = 15000;
String name = "Mobile";

public void sms()
{
    System.out.println("Messaging Facility");
}

public static void main(String[] args)
{
    Mobile samsung = new Mobile(); //create an intance samsung
    samsung.sms();
    samsung.call();
    samsung.received_call();

    
    System.out.println("samsung price = "+ samsung.price);
    System.out.println("samsung name= "+ samsung.name);
    Telephone bsnl = new Telephone();   //create an intance bsnl

    System.out.println("bsnl price = "+ samsung.price);
    System.out.println("bsnl name = "+ samsung.name);
    bsnl.call();
    bsnl.received_call();

}

}
