class SuperMarket{

String brand;
int price,discount;      //line no 3,4 global non static variable

SuperMarket(String brand,int price,int discount){     //local variable (String brand,int price,int discount)

this.brand = brand;                                 //this keyword use which is useful for indicating current object of same class.
this.price = price;
this.discount = discount;

}
SuperMarket(String brand,int price){
this.brand=brand;
this.price=price;

}
SuperMarket(){
System.out.println("take a sip free");
}

public static void main (String[] args){

SuperMarket brush = new SuperMarket("pepsodent",30,5);
SuperMarket soap = new SuperMarket("Lux",25,2);
SuperMarket rice = new SuperMarket("ponni",40);
SuperMarket boost = new SuperMarket();

rice.purchase();
brush.purchase();
soap.purchase();
}

void purchase(){

System.out.println("Customer is buying product "+ brand + " for Rs "+ price +  " with discount "+ discount);
}

}
