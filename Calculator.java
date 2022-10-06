class Calculator{

public static void main (String [] args){     //Main Method - public static void main(String [] agrs)

Calculator calc = new Calculator();            //new - Memory allocate; = new Calculator - object; calc - Reference Name; Calculator - class Name
                                                

calc.add();                 // method calling statement
calc.subtract();            // method calling statement
calc.multiply();            // method calling statement
calc.divide();              // method calling statement

}

void add()                  //Method Signature - Method Name - add()
{                           // Line no 14 to 16 Method Definition
System.out.println(10+20);
}

void subtract()             //Method Signature - Method Name - subtract()
{                           // Line no 19 to 22 Method Definition

System.out.println(10-20);
}

void multiply()             //Method Signature - Method Name - multiply()
{                           // Line no 25 to 27 Method Definition
System.out.println(10*20);
}

void divide()               //Method Signature - Method Name - divide()
{                           // Line no 30 to 32 Method Definition
System.out.println(10/20);
}



}
