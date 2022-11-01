package tamilnadu.erode;
import tamilnadu.chennai.Office;

// compile- javac -d . Branch_Office.java
// Run- java tamilnadu.erode.Branch_Office

public class Branch_Office extends Office
{



public static void main (String[] args)
{
Branch_Office manager = new Branch_Office();
System.out.println(manager.pay_salary());
manager.work();
}
public void work()
{
//System.out.println("working 10-10 pm");
}

}




