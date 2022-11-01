class TrainingRoom
{
String courseName = "Java"; 
int time = 1130; 

public static void main(String[] args)
{
TrainingRoom trainer = new TrainingRoom(); 
trainer.sendMessage(); 
System.out.println(trainer.courseName); 
System.out.println(trainer.time); 
}
void sendMessage()
{
int minutes = 5; 
System.out.println("will be late for " + minutes); 
}

}
