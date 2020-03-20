package c_contorl;

public class test_03_16 {
public static void main(String[] args) {
	
	
	int i =1, j=0;
	  switch ( i ) {
	      case 2 : j += 6; //break; (정해진 값에서 break;가 있는경우 해당하는 값에 더 실행하지 않고 멈춤)
	   case 4 : j += 1;
	   default : j += 2; //기본형으로 변수에 해당없으면 default 보다 시작
	   case 0 : j += 4;
	  }
	  System.out.println( j );

}
}