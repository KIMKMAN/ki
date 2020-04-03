/*
 * 자료형 관련 클래스 : Wrapper class
 * Byte / Short
 * Character
 * Integer / Long
 * Float / Double
 * 
 * 형변환 관련하여 ...
 * 
 * 
 *  **** String -> int 형
 *  	Integer.parseInt()
 * 
 * 
 * 	**** int 형 -> String
 * 		"" + 10 -> "10"
 * 		String.valueof(10) -> "10"
 * 
 *  
 */

package c_collection;
import java.util.ArrayList;

class aArrayListEx_0
{
	public static void main(String[] args) 
	{
		Object[]data = dataSet();
		for(int i =0; i<data.length; i++)
			System.out.println(data[i]);
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()
	{// 이것들을 따로 클래스를 만들지 않고 각각의 클래스를 object 로 묶는다.
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		Object[] data = new Object[3];
		data[0] = name;
		data[1] = new Integer(age); // int) 기분형 int -> Integer
		data[2] = new Double (height);// double -> Double
		return data;
	}
}
