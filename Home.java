class Home{

public static void main(String[] args){

Home home = new Home();
int amount=home.read_ed(100);
System.out.println("You have to pay "+amount); // you have to pay + = concadination
}

int read_ed(int unit){
// line no 11 to 15 execute
float units=150.3f;
int amount=(int)units*2;  // (int)units = typecasting
      
return amount;
}

}
