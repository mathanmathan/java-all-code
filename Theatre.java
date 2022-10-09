class Theatre{

public static void main (String[] args){
 
Theatre raja = new Theatre();
int balance=raja.bookTicket(200);
System.out.println("After book ticket "+balance); 
}

int bookTicket(int price){
int ticket=price;
int ticket_price=120;
int balance = ticket-ticket_price;
return balance;

}

}
