package onwardpath;

public class test11 {
void show()
{
	long StartTime=System.currentTimeMillis();
	StringBuffer s=new StringBuffer("java");
	for(int i=0;i<=1000;i++)
	{
		s.append("point");
	}
	System.out.println("Time diff for string buffer"+(System.currentTimeMillis()-StartTime)+"ms");

	
}
void print()
{
	long StartTime=System.currentTimeMillis();
	StringBuilder s=new StringBuilder("java");
	for(int i=0;i<=1000;i++)
	{
		s.append("point");
	}
	System.out.println("Time diff for string builder"+(System.currentTimeMillis()-StartTime)+"ms");

}
	public static void main(String[] args) {
		test11 t=new test11();
		t.show();
		t.print();
		

	}

}
