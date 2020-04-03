package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet(); //Set이 들어가면 중복이 안됨 
					//Tree 구조는 작으면 왼쪽 크면 오른쪽으로 간다. 읽는 방법을 알면 정렬을 알수있다
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion"); // 1
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snacke");
		set.add("zebra");
		set.add("bee");
		set.add("lion"); // 2

		System.out.println( set );
		

	}
}
