import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		 byte  b = 127;
//
//         char  ch = '글';
//
//         int   i = 20000000;
//
//         long  l =  1L; 
//         
//         //1
//         // b = ( byte ) i;
//         //2
//         // i = ch;
//         //3
//         // int  var = b;
//         //4
//          float  f = l;
//          System.out.println( f );
//         //5
//         // l = i;

		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print(" 해당년도 : ");
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			
			System.out.println(" 윤년");
		}else {
			System.out.println("윤년이 아님");
		}
	}

}

// next() : spacebar 혹은 tap 이 입력 받을때까지 버퍼에 담긴다.
// nextLine() : enter 가 입력 받을때까지 ("\n") 버퍼에 담긴다.