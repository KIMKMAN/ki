package network1.basic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import network2.thread.Client;
public class SimpleClient {
	
	public final static int PORT = 5000;
	public final static String HOST = "192.168.0.18";
	
	public static void main( String args[] ) {
		
		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		// 콘솔 입력을 받기 위해
		Scanner stdin = new Scanner( System.in );
		

		try{ 
					
		// 1. 서버에 연결하기 위해 소켓 생성
		client = new Socket(HOST, PORT); // accept
				
		// 2. 소켓의 입출력 스트림 얻기
		in = new DataInputStream(client.getInputStream());
		out = new DataOutputStream(client.getOutputStream());
	
		
		// 3. 키보드 입력 받아 서버에 전송
		System.out.println("짝궁에게 인사말을 ->");
			String inData = stdin.nextLine();
				out.writeUTF(inData);
				
		// 4. 서버로부터 응답을 받음
			System.out.println(in.readUTF());
	
		
		// 5. 입출력 스트림의 닫음
			in.close();
			out.close();
			
			
		} catch ( Exception ex ) {
			System.out.println("Error writing.." + ex );	
		}
	}	
}