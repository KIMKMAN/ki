package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add("rabbit"); //add로 표준화를 됨
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		
				
		
		
		System.out.println( set ); //중복이 들어가지않는 위해서
	}
}
