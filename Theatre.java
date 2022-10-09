class Theatre{

public static void main (String[] args){
 
Theatre raja = new Theatre(); //raja object creation
int balance=raja.bookTicket(200); //int balance return value and bookTicket(200)args passing
System.out.println("After book ticket "+balance); // + symbol  concadination operators
}

int bookTicket(int price){      //int price agrs taken
int ticket=price;
int ticket_price=120;           // 120 assign local variable int ticket_price
int balance = ticket-ticket_price; // local variable int balance
return balance;             //return type balance value 

}

}
