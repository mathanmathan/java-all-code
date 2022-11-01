package tamilnadu.erode;

class Final_Variable{

final int speedlimit = 80;  //final variable assign value not change that value


void run(){

    speedlimit=120;
    System.out.println("speedlimit "+ speedlimit);
}
public static void main(String[] args){

Final_Variable fv = new Final_Variable();
fv.run();


}


}
