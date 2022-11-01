class HumanBeing{
int amount = 100000;  // globalvariable

public static void main(String[] args)
{
HumanBeing hb = new HumanBeing();
hb.trip(20000);
}
void trip(int amount) 
{
System.out.println(amount); //amount name is local variable [local and global variable with same name(int amount) precedence(munnurimai) will be giveen to local variable]
}


}
