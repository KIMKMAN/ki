package b_operator;

/*
 * 이진논리 : &(and) |(or) ^(xor)
 */
public class Ex07_BinaryLogical {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		
		System.out.println(a & b); // 0000 1111 
		System.out.println(a | b); // 0000 1010
		System.out.println(a ^ b); // 0000 1010 10
		                           // 0000 1111 15
		                           // 0000 0101 5

	}

}


