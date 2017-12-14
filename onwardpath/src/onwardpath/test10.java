package onwardpath;

public class test10 {

	public static void main(String[] args) {
		System.out.println("commit");
		long StartTime=System.currentTimeMillis();
		StringBuilder s=new StringBuilder("java");
		for(int i=0;i<=10000;i++)
		{
			s.append("point");
		}
		System.out.println("Time diff"+(System.currentTimeMillis()-StartTime)+"ms");
System.out.println("sucess");
	
	}

}
