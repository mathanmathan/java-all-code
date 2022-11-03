package looptask;

public class LoopConcept {

	public static void main(String[] aegs) 
	{
		LoopConcept loop = new LoopConcept();
		loop.addno();
		loop.evenNo();
		loop.oddNo();
		loop.decrementNo();
	}
	void addno()
	{
		int nos=1;
		while(nos<=9) 
		{
			System.out.print(nos);
			nos=nos+2;
		}
		System.out.println();
	}
	void evenNo() {
		
		int no=0;
		while(no<=8) {
			System.out.print(no);
			no=no+2;
			}
		System.out.println();
	}
	void oddNo() {
		int no=3;
		while(no<=15)
		{
			System.out.print(no);
			no=no+3;
		}
		System.out.println();
	}
	void decrementNo() {
		int no=25;
		while(no>=5)
		{
			System.out.print(no);
			no=no-5;
		}
	}
}
